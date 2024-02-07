Feature:Scenario outline eample
  Scenario Outline :Quote tests with datasets
    Given I open url "https://quote-stage.portnov.com"
    Then I enter "fullname" into the field with xpath "//input[@id='name']"
    And I enter "username" into the field with xpath "//input[@name='username']"
    And I enter "email" into the field with xpath "//input[@name='email']"
    And I enter "password" into the field with xpath "//input[@name='password']"
    And I enter "password" into the field with xpath "//input[@name='confirmPassword']"
    And I click on element with xpath "//input[@name='agreeToPrivacyPolicy']"
    And I click on element with xpath "//button[@name='formSubmit]'"
    And i wait for 3 sec
    Examples:
      |  fullname | username | email          | password |
      | Anu      |AnuPradhan |test@gmail.com | 12345    |
      |Ana       |AnaPradhan |test1@gmail.com|54321     |


