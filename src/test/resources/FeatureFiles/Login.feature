Feature: User credentials

  Scenario:User can login with valid credentials
    Given User is on the login page
    And User enters valid 'username' and 'password'
    When User clicks on 'Login' button
    Then User should be logged in and redirected to the home page