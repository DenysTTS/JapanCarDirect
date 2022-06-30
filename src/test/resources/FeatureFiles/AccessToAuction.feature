Feature: Japanese Auction Access
  Background: User is logged in
    Given User is on the login page
    When User enters valid 'username' and 'password' and logs in
    Then User is on the login page

  @wip
  Scenario: User accesses the auctions tab
    When User clicks on the auctions tab
    Then User should be able to see the auctions