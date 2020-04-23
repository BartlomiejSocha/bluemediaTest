package BlueMediaSet;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static BlueMediaSet.Settings.SettingProp.getProp;
import static java.lang.System.setProperty;

public class PageObjectSet {

    static String browser;
    public static WebDriver driver;
    private static WebDriverWait driverWait;
    private static final String baseUrl = getProp("baseURL");

    @BeforeClass
    public static void setUp() {
        browser = getProp("browser");
        if (browser.equals("firefox")) {
            setProperty("webdriver.gecko.driver", "Browser//geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driverWait = new WebDriverWait(driver, 15);
            driver.get(baseUrl);
        } else if (browser.equals("chrome")) {
            setProperty("webdriver.chrome.driver", "Browser//chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            driver = new ChromeDriver(chromeOptions);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driverWait = new WebDriverWait(driver, 15);
            driver.get(baseUrl);
        }
    }
    public WebElement waitForVisibility(WebElement webElement) {
        driverWait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement;
    }
    public static WebElement waitForClickable(WebElement webElement) {
        driverWait.until(ExpectedConditions.elementToBeClickable(webElement));
        return webElement;
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
        driver.quit();
    }
}
