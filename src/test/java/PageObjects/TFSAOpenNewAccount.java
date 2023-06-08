package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

public class TFSAOpenNewAccount extends BasePage {
    WebDriver driver;

    public TFSAOpenNewAccount(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, driver);
    }

    @FindBy(id = "header-sign-in-btn")
    WebElement signInButton;
    @FindBy(xpath = "//*[@id=\"dvl-wpr\"]/main/section[2]/div/div[1]/div[1]/div/div/a/span")
    WebElement TFSACalculator;
    @FindBy(xpath = "//*[@id=\"index-container\"]/div[2]/div[2]/div/div[1]/div/div/div/button/a/p")
    WebElement openNewTFSA;
    @FindBy(xpath = "//*[@id=\"TFSA\"]/fieldset/div/div/label[2]")
    WebElement clickOnYes;
    @FindBy(className = "icon-40")
    WebElement icon40;

    public void scrollDownTillNewTFSA() {
        TFSACalculator.click();
        Actions action = new Actions(driver);
        action.scrollToElement(openNewTFSA).perform();
    }

    public void clickOnNewTFSA() {
        openNewTFSA.click();
    }

    public void switchToNewWindow() {
     /*   String winHandleCurrent = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);


        }*/
        Set<String> handles = driver.getWindowHandles(); //to store all window handles
        Iterator it = handles.iterator();
        String parentID=(String) it.next();
        String childId=(String) it.next();
        driver.switchTo().window(childId);
        clickOnYes.click();
       // icon40.click();
    }

}
