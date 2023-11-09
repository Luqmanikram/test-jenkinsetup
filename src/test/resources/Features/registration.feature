Feature: Verify Registration Functionality
  Scenario: New customer registration
    Given I am on the registration page
    When I enter a valid Username "Jon5333avv13D66oe123"
    And I enter a valid Email address "jo5hnaaa163336oe@example.com"
    And I enter a valid Password "joho567eaaaa1333@example.com"
    And I submit the registration form
    Then I should be automatically redirected to the customer login page