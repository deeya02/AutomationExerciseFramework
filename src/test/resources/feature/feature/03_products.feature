Feature: Product Functionality

  Scenario: Search product
    When user opens products page
    And user searches product "Dress"
    Then searched products should be displayed

  Scenario: View product details
    When user opens first product details
    Then product details should be visible

  Scenario: Filter products
    When user filters products by women dress category
    Then category filtered products should be displayed