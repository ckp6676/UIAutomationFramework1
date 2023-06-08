package TestRunners;

import PageObjects.RRSPCalculator;
import Utils.BrowserFactory;
import org.testng.annotations.Test;

public class RRSPCalaculatorTestRunner extends BaseTest {
    @Test
    public void RRSPCalculatorTest(){
        RRSPCalculator rc = new RRSPCalculator(BrowserFactory.getBrowser());
        rc.clickOnRRSPCalculatorLink();
    }
}
