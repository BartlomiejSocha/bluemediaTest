package BlueMediaTests;

import BlueMediaSet.GeneralForm;
import BlueMediaSet.PageObjectSet;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.awt.*;

@FixMethodOrder(MethodSorters.JVM)
public class FormTest extends PageObjectSet {

    GeneralForm generalForm = new GeneralForm(driver);

    @Test
    public void mainTest() throws InterruptedException, AWTException {

        generalForm.selectClientRadio();
        generalForm.typeClientName();
        generalForm.typeEmail();
        //generalForm.typeCompanyName();
        generalForm.typeTelephoneNumber();
        generalForm.selectPrzelewy();
        generalForm.typeDetailsBody();
        generalForm.selectBox();
        generalForm.selectAgreement();

    }

}
