package step_definition;

import config.env_target;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.accountOverviewPage;

public class accountOverview extends env_target{
    accountOverviewPage accOverview = new accountOverviewPage(driver);

    @When ("User navigates to open account overview page")
    public void userNavigatesToOpenAccountOverviewPage(){
        accOverview.clickOpenNewAccount();
    }

    @And("User select bank account")
    public void userSelectBankAccount(){
        accOverview.clickAccountNumber();
        
    }

    @And ("User choose period and time")
    public void userChoosePeriodAndTime(){
        accOverview.filterTransaction();
    }

    @And ("User click go button")
    public void userClickGoButton(){
        accOverview.clickSubmit();
    }

    @Then ("User views account transaction history")
    public void userViewsAccountTransactionHistory(String result){
        boolean isSuccess = accOverview.isSuccessDisplayedOverview(result);

        assert isSuccess : result;
    }
     
}
