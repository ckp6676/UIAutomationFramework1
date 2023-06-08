package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RRSPCalculator extends BasePage {
    public WebDriver driver;
    public RRSPCalculator(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(this.driver,this);
    }

    @FindBy(id = "rsp-calc")
    WebElement RRSPCalculatorLink;

    public void clickOnRRSPCalculatorLink(){
        RRSPCalculatorLink.click();
    }
}
