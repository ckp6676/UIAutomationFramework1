package TestRunners;

import DataReaders.PropertyFileReaders;
import PageObjects.LoginPage;
import PageObjects.TFSAOpenNewAccount;
import Utils.BrowserFactory;
import Utils.CommonUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.*;

public class BaseTest {

    String bname, runmode;
    WebDriver driver;

    @BeforeMethod(groups = {"low", "medium", "high"})
    public void openBrowserAndLaunchApplication() {
        String brname = PropertyFileReaders.getPropertyValue("yourStore.browsername");
        driver = BrowserFactory.getBrowser(brname);
        String url = PropertyFileReaders.getPropertyValue("yourStore.url");
        BrowserFactory.launchApplication(url);

    }

    /*    @AfterMethod(groups = {"low","medium","high"})
        public void closeBrowser() {
            BrowserFactory.closeAllWindow();
        }
    */
    @BeforeClass(groups = {"low", "medium", "high"})
    public void toKnowWhichClassIsExecuting() {
        System.out.println(super.getClass().getName() + " is executing");
    }

    @Parameters({"browser_name_to_execute"})
    @BeforeTest(groups = {"low", "medium", "high"})
    public void readBrowserName(@Optional("chrome") String bname) {
        this.bname = bname;

    }

    @BeforeGroups(groups = "low")
    public void cuation() {
        System.out.println("dont't acess machine for 15 min");
    }

    @BeforeGroups(groups = "low")
    public void Aftercuation() {
        System.out.println("you can access machine");
    }

    @AfterMethod(groups = {"low,medium", "high"})
    public void a_takeScreenshots(ITestResult result) {
        if (!result.isSuccess()) {
            CommonUtil.takePageVisibleScreenshot();
        }
        BrowserFactory.closeCurrentWindow();
        BrowserFactory.closeAllWindow();

    }



}
