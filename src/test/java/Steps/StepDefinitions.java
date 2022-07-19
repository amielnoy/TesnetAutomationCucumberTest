package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Account;

public class StepDefinitions {

    @Given("account balance is {double}")
    public void givenAccountBalance(Double initialBalance) {
        Account account = new Account(initialBalance);
    }

    @When("the account is credited with {double}")
    public void theAccountIsCreditedWith(int arg0, int arg1) {

    }

    @Then("account should have a balance of {double}")
    public void accountShouldHaveABalanceOf(int arg0, int arg1) {
    }

    // other step definitions

}