package step_definition;

import config.env_target;
import pageObject.homePage;
import pageObject.registerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class register extends env_target{

    homePage home = new homePage(driver);
    registerPage regist = new registerPage(driver);
    
    @When("User clicks the register link")
    public void userClicksTheRegisterLink() {
        home.clickRegister();
    }

    @Then("User is on the registration page")
    public void userIsOnTheRegistrationPage() {
        regist.openRegistrationPage();
    }

    @When("User inputs name")
    public void userInputsName() {
        registerPage regist = new registerPage(driver);
        regist.inputNameData("John", "Doe");
    }

    @And("User inputs address details")
    public void userInputsAddressDetails() {
        regist.inputAddressDetail("Jl. Pahlawan No. 89", "Jakarta", "Indonesia", "654321", "092123456888", "lorem123");
        // //user input address
        // driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]")).sendKeys("Jl. Pahlawan No. 89");
        // //user input city
        // driver.findElement(By.name("customer.address.city")).sendKeys("Jakarta");
        // //user input state
        // driver.findElement(By.cssSelector("#customer\\.address\\.state")).sendKeys("Indonesia");
        // //user input zip code
        // driver.findElement(By.id("customer.address.zipCode")).sendKeys("654321");
        // //user input phone
        // driver.findElement(By.name("customer.phoneNumber")).sendKeys("092123456888");
        // //user input SSN
        // driver.findElement(By.name("customer.ssn")).sendKeys("lorem123");
    }

    @And("User enters username and password")
    public void userEntersValidUsernameAndPassword() {
        Random rand = new Random();
        int noRandom = rand.nextInt(10000);
        regist.inputCredentialRegist("john"+noRandom, "123456");
        // driver.findElement(By.name("customer.username")).sendKeys("john"+noRandom);
        // driver.findElement(By.name("customer.password")).sendKeys("123456");
    }

    @And("User confirms correct password")
    public void userConfirmsCorrectPassword() {
        regist.confirmPassword("123456");
        // driver.findElement(By.id("repeatedPassword")).sendKeys("123456");
    }

    @And("User enters mismatched password confirmation")
    public void userEntersMismatchedPasswordConfirmation() {
        regist.confirmPassword("qwerty");
        // driver.findElement(By.id("repeatedPassword")).sendKeys("qwerty");
    }

    @And("User clicks register button")
    public void userClicksRegisterButton() {
        regist.clickRegistButton();
        // driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
    }

    @Then("User registered successfully")
    public void userRegisteredSuccessfully() {
        regist.successRegist();
        // driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/h2"));
    }

    @Then("User sees an error message")
    public void userSeesAnErrorMessage() {
        regist.failedRegist();
        // Duration duration = Duration.ofSeconds(10);
        // WebDriverWait wait = new WebDriverWait(driver, duration);
        // wait.until(
        //         ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"repeatedPassword.errors\"]"))
        // );
    }
}
