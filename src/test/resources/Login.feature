Feature: Login

  Scenario: Login using valid email
    Given user is on login page
#    And user input username with ""
    And user input username with "standard_user"
#    And user input password with ""
    And user input password with "secret_sauce"
    When user click login button
    Then user will be on homepage