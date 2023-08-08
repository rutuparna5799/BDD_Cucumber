Feature: Feature to be Test Login and Logout functionality

  Scenario Outline: Check login successful with valid credentials should be fetch from excel sheet
    Given User is in login home page
    When User enter the valid <username> and valid <password>
    And User click on login button
    Then User is navigated to home page
    Then User able to click logout button in home page

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |
