package pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.driverFactory;

public class homePage extends driverFactory {

    public homePage(WebDriver driver) {
        super(driver);
    }

    // locator home page
    By loginFormTitle = By.xpath("//*[@id=\"leftPanel\"]/h2");
    By registerButton = By.xpath("//a[contains(@href, 'register')]");
    By loginButton = By.xpath("//input[@class='button' and @value='Log In']");
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By successIndicator = By.xpath("//*[@id=\"leftPanel\"]/p/b");
    By failedIndicator = By.xpath("//*[@id=\"rightPanel\"]/p");

    public void openHomePage() {
        wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"leftPanel\"]/h2")));
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void clickRegister() {
        driver.findElement(registerButton).click();
    }

    public void inputCredentials(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
    }

    public boolean verifyLogin(String result){
        if(result.equalsIgnoreCase("Passed")) {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(successIndicator)).isDisplayed();
        } else {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(failedIndicator)).isDisplayed();
        }
    }
}
