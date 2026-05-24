Feature: Login Functionality

Background:
Given user launches Automation Exercise website

  Scenario: Successful login
    When user opens signup login page
    When user logs in with valid credentials
    Then user should be logged in

  Scenario: Invalid login
    When user opens signup login page
    When user logs in with invalid credentials
    Then login error message should be visible