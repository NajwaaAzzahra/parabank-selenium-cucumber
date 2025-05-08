package util;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elementUtil extends driverFactory{


    public elementUtil(WebDriver driver){
        super(driver);
    }

    public void selectDropdownByIndex(By locator, int index){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dropdown = wait.until(ExpectedConditions.presenceOfElementLocated(locator));

        Select select = new Select(dropdown);
        wait.until(d -> select.getOptions().size() > index);
        select.selectByIndex(index);
    }
    
}
