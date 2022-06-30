package StepDefinitions;

import Pages.HomePage;
import Utilities.BrowserUtils;
import Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class LogOutStepDefinitions {
    HomePage homePage = new HomePage();
    @When("User logs out")
    public void user_logs_out() {
        BrowserUtils.waitForClickablility(homePage.LogoutButton, 5);
        homePage.LogoutButton.click();

    }
    @Then("User should be logged out")
    public void user_should_be_logged_out() {
        String expectedURL = "https://auc.japancardirect.com/";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assertions.assertEquals(expectedURL, actualURL);

    }
}
