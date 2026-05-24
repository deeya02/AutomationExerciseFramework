Feature: Checkout Functionality
  Scenario: Complete checkout process
    Given user launches Automation Exercise website
    When user logs in with valid credentials
    And  User clicks products button
    And  User adds first product to cart
    And User clicks continue shopping
    And User clicks cart button
    Then Cart page should be displayed
    And Product should be added to cart
    When User clicks proceed to checkout
    Then checkout page should be loaded
    When user places order
    And user enters payment details
    And user confirms payment

    Then order should be placed successfully