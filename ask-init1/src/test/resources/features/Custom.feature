Feature: webDriver feature
  Scenario: WebDriver test Scenario
    Given client open web page

  Scenario:Portnov responsive test
    Given client open portnov web page
    Then client set browser size to mobile

    Scenario: Iterate through elements
      Given client open test url for the form
      And I type "111"into all input fields
      Then I wait for 2 sec

  Scenario: Location strategy examples
    Given I open url "http://quote-stage.portnov.com/"
    Then I search for the element



  @quote1
  Scenario:(Smoke Test) Fill out the Required Fields of Quote and arrive on the Confirmation Page
    Given I visit Quote Page in the "QA" Environment
    When I enter "username" for the Username field
    And I enter "first" for first name and "last" for the last name in the Name field
    And I enter "email" for the Email field
    When I enter "password" for the Password field
    And I enter "password" for the Confirm Password field
    Then I "check" the Privacy Policy Policy checkbox
    When I click on the "Submit" button at the bottom of the page
#    Then I verify we see the Submitted Application Page






