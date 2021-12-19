package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;

import java.io.IOException;

public class HomeSteps extends TestBase {
    public HomeSteps() throws IOException {
    }

    HomePage homePage;

    @Then("User should navigate to home page")
    public void user_should_navigate_to_home_page() {
        homePage.checkHome();
    }

    @And("Click on contacts")
    public void Click_on_contacts() throws IOException {
        homePage = new HomePage();
        homePage.openContacts();
    }
    @And("User take a snapshot")
    public void userTakeASnapshot() throws IOException {
        homePage = new HomePage();
        takeSnapshot();
    }
}
