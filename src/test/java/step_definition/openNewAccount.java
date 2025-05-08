package step_definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.env_target;
import pageObject.openNewAccountPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class openNewAccount extends env_target{
    openNewAccountPage newAcc = new openNewAccountPage(driver);

    @When("User navigates to Open New Account page") 
    public void userNavigateToOpenNewAccountPage(){
        newAcc.clickOpenNewAccount();
    }

    @And("User selects account type")
    public void userSelectAccountType(){
        newAcc.selectAccountType();
    }

    @And("User selects existing account")
    public void userSelectExistingAccount(){
        newAcc.selectFromAccount();
    }

    @And("User click submits button")
    public void userClickSubmitButton(){
        newAcc.clickSubmit();
    }
    
    @Then("User account registered successfully")
    public void userAccountRegisteredSuccessfully(){
        newAcc.succesAddAccount();
    }
}
