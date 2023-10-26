Feature: login functionality
  Scenario: verify user should able to login successfully with valid username and password.
  Given I launch the chrome browser and enter orangehrm url
  When I enter username and password
  And I click on login button
  Then I should the dashboard
