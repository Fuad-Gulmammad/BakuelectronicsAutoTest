@ShoppingCart

Feature: Manage Shopping Cart
  As a user
  I want to manage products in my shopping cart
  So that I can control what I purchase

Scenario: Manage products in the shopping cart

Given The user adds notebook to shopping cart
When The user updates the quantity of the notebook by increasing it
And The user updates the quantity of the notebook by decreasing it
Then The user removes the notebook from the shopping cart

Given The user adds smartphone to shopping cart
When The user updates the quantity of the smartphone by increasing it
And The user updates the quantity of the smartphone by decreasing it
Then The user removes the smartphone from the shopping cart


