Feature: Open contacts features

  @Regression
  Scenario: Make sure that email Free account is visible
    Given User open website and go to login page
    When User fill email as "msaber9765@gmail.com" and "Saber116232" and click on login
    And Click on contacts
    Then Free account should appear

  @Sanity
  Scenario: Add new Contact
    Given User open website and go to login page
    When User fill email as "msaber9765@gmail.com" and "Saber116232" and click on login
    And Click on contacts
    And Click on create contact
    And fill the first name and last name
    Then A new contact should be added
