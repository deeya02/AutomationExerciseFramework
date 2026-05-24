Feature: Cart Functionality

  Scenario: Add product to cart

    When User clicks products button
    And User adds first product to cart
    And User clicks continue shopping
    And User clicks cart button
    Then Cart page should be displayed
    And Product should be added to cart