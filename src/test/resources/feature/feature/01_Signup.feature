Feature: Signup Functionality

  Scenario: Successful account creation
    When user opens signup login page
    Then signup page should be visible
    When user enters new signup details
    And user fills account information
    And user clicks create account
    Then account should be created successfully

  Scenario: Signup with existing email
    When user opens signup login page
    Then signup page should be visible
    When user enters existing signup email
    Then existing email error message should be visible