 Feature: User credentials


  @wip
 Scenario: User can log in with valid credentials
    Given User is on the login page
    When User enters valid 'username' and 'password' and logs in
    Then User should be logged in
