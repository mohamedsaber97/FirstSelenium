package pages;

import base.TestBase;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePage extends TestBase {
    public HomePage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='header item']")
    WebElement home;

    @FindBy(xpath = "//span[contains(text(),'Contacts')]")
    WebElement contacts;

    public void checkHome() {
        Assert.assertTrue(home.isDisplayed());
    }

    public void openContacts() {
        action.moveToElement(contacts);
        contacts.click();
    }
}
