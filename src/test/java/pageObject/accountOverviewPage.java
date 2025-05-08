package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import util.driverFactory;
import util.elementUtil;

public class accountOverviewPage extends driverFactory{

    elementUtil elementUtil;

    public accountOverviewPage(WebDriver driver){
        super(driver);
    }

    By menuAccountOverview = By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a");
    By accountNumber = By.linkText("15009");
    By activityPeriod = By.xpath("//*[@id=\"month\"]");
    By type = By.xpath("//*[@id=\"transactionType\"]");
    By submit = By.xpath("//*[@id=\"activityForm\"]/table/tbody/tr[3]/td[2]/input");
    By transactionTable = By.xpath("//*[@id=\"transactionTable\"]/thead/tr");
    By noTransaction = By.xpath("//*[@id=\"noTransactions\"]/b");
    
    public void clickOpenNewAccount(){
        driver.findElement(menuAccountOverview).click();
    }

    public void clickAccountNumber(){
        driver.findElement(accountNumber).click();
    }

    public void filterTransaction(){
        elementUtil.selectDropdownByIndex(activityPeriod, 1);
        elementUtil.selectDropdownByIndex(type, 0);
    }

    public void clickSubmit(){
        driver.findElement(submit).click();
    }

    public boolean isSuccessDisplayedOverview(String result){
        if(result.equalsIgnoreCase("Passed")) {
            // return wait.until(ExpectedConditions.visibilityOfElementLocated(transactionTable)).isDisplayed();
            return wait.until(ExpectedConditions.presenceOfElementLocated(transactionTable)).isDisplayed();

        } else {
            // return wait.until(ExpectedConditions.visibilityOfElementLocated(noTransaction)).isDisplayed();
            return wait.until(ExpectedConditions.presenceOfElementLocated(noTransaction)).isDisplayed();

        }
    }
}