package PageObjects;

import DataReaders.PropertyFileReaders;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.swing.*;

public class LoginPage extends BasePage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);

    }

    @FindBy(id = "header-sign-in-btn")
    WebElement signInButton;
    @FindBy(xpath = "//*[@id=\"dvl-wpr\"]/main/section[2]/div/div[1]/div[1]/div/div/a/span")
    WebElement TFSACalculator;
    @FindBy(id = "province")
    WebElement youLivenDropDown;
    @FindBy(id = "income")
    WebElement yourAnnualIncome;
    @FindBy(id = "investment")
    WebElement yourInvestment;
    @FindBy(id = "contribution")
    WebElement yourContribution;
    @FindBy(id="frequency")
    WebElement yourFrequency;
    @FindBy(id = "interest-rate")
    WebElement rateOfReturn;
    @FindBy(id="timeframe")
    WebElement timeFrame;
    @FindBy(id="submit")
    WebElement calculateButton;

    public void scrollDownTillTFSACalculator(){
        Actions mouseAction= new Actions(driver);
        mouseAction.scrollToElement(TFSACalculator).perform();
    }

    public void clickOnTFSACalculator() {

        TFSACalculator.click();

    }
    public void selectAllFieldsForCalculator(){
        Select s = new Select(youLivenDropDown);
        Select s1 = new Select(yourFrequency);
        s.selectByVisibleText("Ontario");
        yourAnnualIncome.sendKeys("10");
        yourInvestment.sendKeys("1200");
        yourContribution.sendKeys("10000");
        s1.selectByVisibleText("Monthly");
        //rateOfReturn.sendKeys("");
        timeFrame.sendKeys("13");
        calculateButton.click();

    }

}
