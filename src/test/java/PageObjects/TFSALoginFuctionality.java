package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TFSALoginFuctionality extends BasePage{

    WebDriver driver;
    public TFSALoginFuctionality(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }
    @FindBy(id="header-sign-in-btn")
    WebElement singIn;

    public void clickOnSingIn(){
        singIn.click();
    }

    @FindBy(id="userName") WebElement username;

    public void enterCreditCardDetails(Object creditCardNumbers){
        username.sendKeys(creditCardNumbers.toString());
    }
}
