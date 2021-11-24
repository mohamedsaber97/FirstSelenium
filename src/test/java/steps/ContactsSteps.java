package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ContactsPage;

import java.io.IOException;

public class ContactsSteps extends TestBase {

    public ContactsSteps() throws IOException {
    }

    ContactsPage contactsPage;


    @Then("Free account should appear")
    public void Email_textField_should_appear() {
        contactsPage.checkContacts();
    }

    @And("Click on create contact")
    public void clickOnAddNewContact() throws IOException {
        contactsPage = new ContactsPage();
        contactsPage.clickCreate();
    }

    @And("fill the first name and last name")
    public void fillTheFirstNameAndLastName() {
        contactsPage.fillData("mohamed", "saber");
    }

    @Then("A new contact should be added")
    public void aNewContactShouldBeAdded() {
        contactsPage.showContact();
    }
}
