package StepDefinitions;

import Pages.HomePage;
import Utilities.BrowserUtils;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;


public class LoginStepDefinitions {
    HomePage homePage = new HomePage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
      Driver.getDriver().get(ConfigurationReader.getProperty("url"));
      Driver.getDriver().manage().window().maximize();
    }
    @When("User enters valid {string} and {string} and logs in")
    public void user_enters_valid_and_and_logs_in(String username, String password) {
        username= ConfigurationReader.getProperty("username");
        password= ConfigurationReader.getProperty("password");
        homePage.LoginButton.click();
        homePage.LoginBoxUsername.sendKeys(username);
        homePage.LoginBoxPassword.sendKeys(password);
        homePage.LoginBoxLoginButton.click();

    }
    @Then("User should be logged in")
    public void user_should_be_logged_in() {
        String expentialURL = "https://auc.japancardirect.com/aj_neo";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assertions.assertEquals(expentialURL, actualURL);

    }

}

