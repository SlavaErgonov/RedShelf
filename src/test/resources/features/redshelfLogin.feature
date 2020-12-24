Feature: RedShelf Login feature

  @loginPositive
  Scenario: Verify user is able to login
    Given User navigates to RedShelf home page
    When User clicks on LogIn button
    And User enters valid credentials on login page and clicks on Log In button
    Then User lands on My Library page

  @loginNegative
  Scenario: Verify user is not able to login
    Given User navigates to RedShelf home page
    When User clicks on LogIn button
    And User enters invalid credentials on login page and clicks on Log In button
    Then User stays on Log In page
