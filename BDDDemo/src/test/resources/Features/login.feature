Feature: Login Page Automation
  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enter valid "<username>" and "<password>"
    And click on login button
    Then user should receive a message
    And close the browser
    Examples:
      | username      | password             |
      | tomsmith      | SuperSecretPassword! |
      | wrongusername | wrongpassword!       |
      |               |                      |

