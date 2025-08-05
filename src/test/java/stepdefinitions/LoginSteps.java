package stepdefinitions;

import io.cucumber.java.en.*;
import org.testng.annotations.Test;

public class LoginSteps {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("User navigates to login page");
    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        System.out.println("User enters username and password");
    }

    @Then("user is redirected to the dashboard")
    public void user_is_redirected_to_the_dashboard() {
        System.out.println("User sees the dashboard");
    }
}
