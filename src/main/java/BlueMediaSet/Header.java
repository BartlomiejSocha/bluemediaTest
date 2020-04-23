package BlueMediaSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends PageObject {

    public Header(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".grid-24:nth-child(2) > .form__radio")
    public WebElement radio1;
    @FindBy(id = "name")
    public WebElement txaClientName;
    @FindBy(id = "email_c")
    public WebElement txaEmail;
    @FindBy(id = "company_name")
    public WebElement txaCompanyName;
    @FindBy(id = "phone")
    public WebElement txaTelephone;
    @FindBy(id = "select2-subject-container")
    public WebElement tabTemat;
    @FindBy(css = ".select2-search__field")
    public WebElement fieldPrzel;
    @FindBy(id = "body")
    public WebElement fieldBody;
    @FindBy(css = ".checkbox:nth-child(1) > .form__radio")
    public WebElement chBox;
    @FindBy(css = ".js__expand:nth-child(1) .js__expand-pre")
    public WebElement chAgreement;
    @FindBy(css = ".cookie-bar__close")
    public WebElement chClose;
}
