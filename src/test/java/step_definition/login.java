package step_definition;

import config.env_target;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.homePage;

public class login extends env_target {
    homePage home = new homePage(driver);

    @When("^User input (.*) and (.*)$")
    public void userInputUsernameAndPassword(String username, String password) {
        home.inputCredentials(username, password);
    }

    @And("User click login button")
    public void userClickLoginButton() {
        home.clickLogin();
    }

    @Then("^User verify login (.*)$")
    public void userVerifyLoginResult(String result) {
        boolean isVerified = home.verifyLogin(result);

        assert isVerified : result;
        // Duration duration = Duration.ofSeconds(10);
        // WebDriverWait wait = new WebDriverWait(driver, duration);

        // if (result.equalsIgnoreCase("Passed")) {
        //     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"leftPanel\"]/p/b")));
        // } else {
        //     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"rightPanel\"]/h1")));
        // }
    }
    
}