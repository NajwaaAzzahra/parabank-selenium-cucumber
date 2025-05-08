package step_definition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.env_target;
import io.cucumber.java.en.Given;
import pageObject.homePage;

public class commonStep extends env_target {
    homePage home = new homePage(driver);
    
    @Given("User is on the parabank homepage")
    public void userIsOnTheParabankHomepage() {    
        home.openHomePage();
    }
}
