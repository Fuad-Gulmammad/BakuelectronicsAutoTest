@Checkout

Feature: Checkout Process
  As a user
  I want to proceed through the checkout process
  So that I can complete my purchase

  Scenario Outline: Completing the checkout process
    Given The user clicks on the Proceed to Checkout button
    When The user enters their phone number "<phone_number>"
    And The user selects the location to pick up the product
    Then The user chooses the payment method and completes the order

    Examples:
      | phone_number |
      | 773578373    |
