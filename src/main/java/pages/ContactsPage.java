package pages;

import base.TestBase;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ContactsPage extends TestBase {

    public ContactsPage() throws IOException {
        PageFactory.initElements(driver, this);
    }


    @FindBy(linkText = "Free account")
    WebElement freeText;

    @FindBy(xpath = "//*[@class='edit icon']")
    WebElement create;

    @FindBy(name = "first_name")
    WebElement firstName;

    @FindBy(name = "last_name")
    WebElement lastName;

    @FindBy(xpath = "//*[@class='save icon']")
    WebElement save;

    @FindBy(xpath = "//div[contains(text(),'Middle Name(s)')]")
    WebElement showMiddle;


    public void checkContacts() {
        Assert.assertTrue(freeText.isDisplayed());
    }

    public void clickCreate() {
        action.moveToElement(create);
        create.click();
    }

    public void fillData(String first, String last) {
        firstName.sendKeys(first);
        lastName.sendKeys(last);
        save.click();
    }

    public void showContact() {
        Assert.assertTrue(showMiddle.isDisplayed());
    }


}
