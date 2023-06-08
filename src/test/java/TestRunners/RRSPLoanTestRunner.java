package TestRunners;

import PageObjects.RRSPInvestmentGrow;
import Utils.BrowserFactory;
import org.testng.annotations.Test;

public class RRSPLoanTestRunner extends BaseTest{


    @Test
    public void testRRSPLoanFunctionality(){
        RRSPInvestmentGrow rig = new RRSPInvestmentGrow(BrowserFactory.getBrowser());
        //rig.scrollDownToLoanLin();
        rig.clickRRSPLoanCalculatorLink();
    }
}
