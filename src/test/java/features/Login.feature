@Login
Feature: Login function

  Scenario Outline: Successful login with valid credentials
    Given The user navigates to the homepage
    And The user clicks on the login button
    When The user enters "<email>" and "<password>"
    Then Clicks on the Daxil ol button and proceeds to the homepage

    Examples:
      | email                    | password  |
      | fuad.gulmammad@gmail.com | Test2025! |



