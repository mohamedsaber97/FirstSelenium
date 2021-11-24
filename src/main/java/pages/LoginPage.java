package pages;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.time.Duration;

public class LoginPage extends TestBase {

    public LoginPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "email")
    WebElement email;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//*[@class='ui fluid large blue submit button']")
    WebElement submit;


    public void loginInvalid(String mail, String pass) {
        email.sendKeys(mail);
        password.sendKeys(pass);
        submit.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public HomePage loginValid(DataTable dataTable) throws IOException {
        email.sendKeys(dataTable.cell(0, 0));
        password.sendKeys(dataTable.cell(0, 1));
        submit.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return new HomePage();
    }

    public void errorMsg() {
        Assert.assertTrue(email.isDisplayed());
    }

}
