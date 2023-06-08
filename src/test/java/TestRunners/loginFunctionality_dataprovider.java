package TestRunners;

import PageObjects.TFSALoginFuctionality;
import Utils.BrowserFactory;
import Utils.excelReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class loginFunctionality_dataprovider extends BaseTest {

    @Test(groups = {"low", "medium", "high"}, dataProvider = "login_tests", dataProviderClass = excelReader.class)
    public void testCreditCardSingIn(Object creditCardNumbers) {
        TFSALoginFuctionality tl = new TFSALoginFuctionality(BrowserFactory.getBrowser());
        tl.clickOnSingIn();
        tl.enterCreditCardDetails(creditCardNumbers);
    }

    String[][] creditCardValues = {
            {"input1", "12345678"},
            {"input2", "23456789"},
            {"input3", "3456789"}
    };

    @DataProvider(name = "creditCardDetails")
    public Object[][] testData(Method m) {
        ArrayList<String[]> outerArray = new ArrayList<>();
        for (String[] singleArray:creditCardValues){
            ArrayList<String> innerArray = new ArrayList<>();
            for(int index =1;index< singleArray.length;index++){
                innerArray.add(singleArray[index]);
            }
            outerArray.add(innerArray.toArray(innerArray.toArray(new String[0]))); //coverting list into arraay
        }
        return outerArray.toArray(new String[0][0]);
    }
}
