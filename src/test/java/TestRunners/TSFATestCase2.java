package TestRunners;

import PageObjects.TFSAOpenNewAccount;
import Utils.BrowserFactory;
import org.testng.annotations.Test;

public class TSFATestCase2 extends BaseTest{
    @Test(groups = "low")
    public void TestTFSACalculatorFunctionalityForNewUser(){

        TFSAOpenNewAccount TFSA = new TFSAOpenNewAccount(BrowserFactory.getBrowser());


        TFSA.scrollDownTillNewTFSA();
        TFSA.clickOnNewTFSA();
        TFSA.switchToNewWindow();
    }

}

