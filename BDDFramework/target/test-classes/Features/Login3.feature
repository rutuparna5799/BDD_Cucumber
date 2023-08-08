Feature: Feature to be Test Login Functionality

  Scenario Outline: Title to Verify login with valid credentials
    Given User should able to launch browser
    When User should open the URL "https://www.saucedemo.com/"
    And User enters user as <username> and pass as <password>
    And User clicked on login button successfully
    Then User should validate text as "Swag Labs" and "Products"
    And User should click on menu button to logout

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
      | standard_user | secret_sauce |
