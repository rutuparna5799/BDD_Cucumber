Feature: Login Functionality

  Scenario Outline: Successful with Valid Credentials
    Given User launch the Chrome Brwoser
    When User should launch the URL "https://www.saucedemo.com/"
    And User enters username as <username> and password as <password>
    And Click on Login
    Then User should be validate text as "Swag Labs"
    Then Click on Open Menu bar
    And Click on Logout
    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |