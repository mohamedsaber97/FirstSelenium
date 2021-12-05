Feature:Test the login functionality

  @Regression @Sanity
  Scenario Outline: login with invalid email and invalid password
    Given User open website and go to login page
    When User fill email as "<email>" and "<password>" and click on login
    Then User see error message
    Examples:
      | email   | password |
      | mohamed | saber123 |
      | ali     | ali123   |

  @Regression
  Scenario: login with valid email and valid password
    Given User open website and go to login page
    When User fill email as email and password and click on login
      | msaber9765@gmail.com | Saber116232 |
    Then User should navigate to home page

