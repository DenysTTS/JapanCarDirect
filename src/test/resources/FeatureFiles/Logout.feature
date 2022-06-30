 Feature: Logging Out

   @wip
   Scenario: User logs out of the account
     Given User is on the login page
     When User enters valid 'username' and 'password' and logs in
     When User logs out
     Then User should be logged out