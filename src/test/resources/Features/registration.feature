Feature: Verify Registration Functionality
  Scenario: New customer registration
    Given I am on the registration page
    When I enter a valid Username "Jon566f123"
    And I enter a valid Email address "jo5haoe@example.com"
    And I enter a valid Password "joho333@example.com"
    And I submit the registration form
    Then I should be automatically redirected to the customer login page