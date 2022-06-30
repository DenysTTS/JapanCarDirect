package StepDefinitions;

import Pages.HomePage;
import Utilities.BrowserUtils;
import Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class AuctionAccess {
    HomePage homePage = new HomePage();

    @When("User clicks on the auctions tab")
    public void user_clicks_on_the_auctions_tab() {
        BrowserUtils.waitForClickablility(homePage.JapaneseAuctionsButton,3);
        homePage.JapaneseAuctionsButton.click();

    }
    @Then("User should be able to see the auctions")
    public void user_should_be_able_to_see_the_auctions() {
        String expectedUrl = "https://auc.japancardirect.com/aj_neo?classic";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assertions.assertEquals(expectedUrl, actualUrl);

    }
}
