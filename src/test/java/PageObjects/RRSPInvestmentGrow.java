package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RRSPInvestmentGrow extends BasePage {
    public WebDriver driver;

    public RRSPInvestmentGrow(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);

    }

    @FindBy(xpath = "//*[@id='rrsp-l-calc']")
    WebElement RRSPLoanCalculator;
    @FindBy(name = "loanAmount")
    WebElement amountToBorrow;
    @FindBy(id = "isTopUp_Yes")
    WebElement yes;
    @FindBy(id = "repayPeriodYY2")
    WebElement years;
    @FindBy(id = "repayPeriodYY2")
    WebElement months;
    @FindBy(id = "apPayFrequency")
    WebElement paymentFrequency;
    @FindBy(name = "interestRate")
    WebElement rates;
    @FindBy(id = "apDefer_Yes")
    WebElement yes2;
    @FindBy(name = "refundPercent")
    WebElement refundTax;
    @FindBy(name = "retireYears")
    WebElement retireYears;
    @FindBy(id = "btn_LoanInformationContinue")
    WebElement continue1;
    @FindBy(id = "apDeferLength")
    WebElement days;
    @FindBy(id = "btn_TaxInformationContinue")
    WebElement continue2;
    @FindBy(id = "btn_RRSPInformationContinue")
    WebElement continue3;

    public void scrollDownToLoanLin() {
        //  JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("arguments[0].scrollIntoView();", RRSPLoanCalculator);
        Actions ac = new Actions(driver);
        ac.scrollToElement(RRSPLoanCalculator).build().perform();
    }

    public void clickRRSPLoanCalculatorLink() {
        RRSPLoanCalculator.click();
    }

    public boolean enterBorrowingAmount(String percentage) {
        amountToBorrow.sendKeys("8989");
        return false;
    }

    public void clickOnYesAtLoanInformation() {
        yes.click();
    }

    public void selectYearAndMonths() {
        Select s = new Select(years);
        Select s1 = new Select(months);
        Select s2 = new Select(paymentFrequency);
        s.deselectByValue("2");
        s1.selectByValue("6");
        s2.selectByIndex(3);
    }

    public void enterCurrentRate(String rate) {
        rates.sendKeys("5");
    }

    public void clickOnYes() {
        yes.click();
    }

    public void clickOnContinue() {
        continue1.click();
    }

    public void selectDays() {
        Select s3 = new Select(days);
        s3.selectByValue("60");
    }

    public void enterRefund(String refund2) {
        refundTax.sendKeys("5");
    }

    public void clickOnContinue2() {
        continue2.click();
    }

    public void entreRetirementYears(String year) {
        retireYears.sendKeys("10");
    }

    public void clickOnContinue3() {
        continue3.click();
    }

}
