package TestRunners;

import DataReaders.PropertyFileReaders;
import PageObjects.LoginPage;
import PageObjects.TFSAOpenNewAccount;
import Utils.BrowserFactory;
import Utils.CommonUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test(groups ="high")
    public void loginTest(){

LoginPage lp = new LoginPage(BrowserFactory.getBrowser());
        CommonUtil.waitDefinite(2);
       lp.scrollDownTillTFSACalculator();
       CommonUtil.waitDefinite(2);
       lp.clickOnTFSACalculator();
       lp.selectAllFieldsForCalculator();
       lp.selectAllFieldsForCalculator();


    }
    @Test(groups = "medium")
    public void TestTFSACalculatorFunctionalityForNewUser(){

        TFSAOpenNewAccount TFSA = new TFSAOpenNewAccount(BrowserFactory.getBrowser());


        TFSA.scrollDownTillNewTFSA();
        TFSA.clickOnNewTFSA();
        TFSA.switchToNewWindow();
    }

}



