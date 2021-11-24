package steps;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

import java.io.IOException;

public class LoginSteps extends TestBase {
    public LoginSteps() throws IOException {
    }

    LoginPage loginPage;
    HomePage homePage;

    @Given("User open website and go to login page")
    public void user_open_website_and_go_to_login_page() {
        initialization(prop.getProperty("browser"));
    }

    @When("User fill email as {string} and {string} and click on login")
    public void user_fill_email_and_password_and_click_on_login(String email, String password) throws IOException {
        loginPage = new LoginPage();
        loginPage.loginInvalid(email, password);
    }

    @When("User fill email as email and password and click on login")
    public void user_fill_email_and_password_and_click_on_login(DataTable dataTable) throws IOException {
        loginPage = new LoginPage();
        homePage = loginPage.loginValid(dataTable);
    }

    @Then("User see error message")
    public void User_see_error_message() {
        loginPage.errorMsg();
    }


}
