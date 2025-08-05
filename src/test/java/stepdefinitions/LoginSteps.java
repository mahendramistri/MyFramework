package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginSteps {
    WebDriver driver;
    @Given("user is on login page")
    public void user_is_on_login_page() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://chatgpt.com");
        Thread.sleep(3000);
        System.out.println("User navigates to login page");
    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        System.out.println("Title of the Page "+ driver.getTitle());
    }

    @Then("user is redirected to the dashboard")
    public void user_is_redirected_to_the_dashboard() {
        System.out.println("User sees the dashboard");
        driver.quit();
    }
}
