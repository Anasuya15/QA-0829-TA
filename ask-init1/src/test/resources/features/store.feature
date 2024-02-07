@store
Feature: store stage test
  Scenario: cenario: Responsive Ui validation
  Given I open url "hpps://store-stage.portnov.com"
  Then I resize window to 700 and 1000
  Then I take screenshot
  Then element with xpath "//nav[@id='site-navigation']" should not be displayed
   And I resize window to 800 and 1000
    And I take screenshot
   Then element with xpath "//nav[@id='site-navigation']" should be displayed

