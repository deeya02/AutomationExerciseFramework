Feature: Contact Us Functionality

  Scenario: Submit contact form
    When user opens contact us page
    Then contact forms should be visible
    When user submits contact form with valid data
    Then contact success message should be visible