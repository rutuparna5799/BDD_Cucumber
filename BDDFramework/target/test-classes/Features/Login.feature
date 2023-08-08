Feature: Feature to be test login functionality

  Scenario: Check login successful with valid credentials
    Given User is in login page
    When User enter the username and password
    And click on login button
    Then user is navigated to home page
    Then user able to logout from that page
