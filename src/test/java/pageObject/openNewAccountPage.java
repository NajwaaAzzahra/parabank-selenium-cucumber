package pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.driverFactory;
import util.elementUtil;

public class openNewAccountPage extends driverFactory{

    elementUtil elementUtil;
    // openNewAccountPage newAcc = new openNewAccountPage(driver);

    public openNewAccountPage(WebDriver driver){
        super(driver);
        this.elementUtil = new elementUtil(driver);
    }

    //locator
    By menuOpenNewAccount = By.xpath("//*[contains(text(), 'Open New Account')]");
    By typeAccountDropDown = By.xpath("//*[@id=\"type\"]");
    By fromAccount = By.xpath("//*[@id=\"fromAccountId\"]");
    By submitButton = By.xpath("//*[@id=\"openAccountForm\"]/form/div/input");
    By successAddAccount = By.xpath("//*[@id=\"openAccountResult\"]/p[2]/b");

    //method
    public void clickOpenNewAccount(){
        driver.findElement(menuOpenNewAccount).click();
    }

    public void selectAccountType(){
        elementUtil.selectDropdownByIndex(typeAccountDropDown, 0);
    }

    public void selectFromAccount(){
        elementUtil.selectDropdownByIndex(fromAccount, 0);
    }

    public void clickSubmit(){
        driver.findElement(submitButton).click();
    }

    public void succesAddAccount(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(successAddAccount));
    }
    
}
