package BlueMediaSet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.StringFormatterMessageFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class GeneralForm extends Header {

    static final Logger log = LogManager
            .getLogger(StringFormatterMessageFactory.INSTANCE);

    public void ScrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollTo(0,700)");
    }

    public void selectClientRadio(){
        ScrollDown();
        waitForVisibility(radio1);
        radio1.click();
        log.info("Radio1 clicked");
    }

    public void typeClientName(){
        txaClientName.sendKeys("BlueServices Test");
    }
    public void typeEmail(){
        waitForVisibility(txaEmail);
        txaEmail.sendKeys("bs@blueservices.pl");
    }
/*    public void typeCompanyName(){
        waitForVisibility(txaCompanyName);
        txaCompanyName.sendKeys("");
    }*/
    public void typeTelephoneNumber(){
        waitForVisibility(txaTelephone);
        txaTelephone.sendKeys("+48 123 123 123");
    }
    public void selectPrzelewy() throws AWTException {
        waitForVisibility(tabTemat);
        tabTemat.click();
        fieldPrzel.sendKeys("Przelewy natychmiastowe");
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }
    public void typeDetailsBody(){
        waitForVisibility(fieldBody);
        fieldBody.sendKeys("automat test Blueservices");
    }
    public void selectBox(){
        waitForVisibility(chBox);
        chBox.click();
    }
    public void selectAgreement() throws InterruptedException {
        waitForVisibility(chAgreement);
        waitForClickable(chAgreement);
        chAgreement.click();
        Thread.sleep(3000);
    }
    public void selectClose(){
        chClose.click();
    }

    public GeneralForm(WebDriver driver) {
        super(driver);
    }
}
