Feature: RedShelf Search feature

  @searchPositive
  Scenario: Verify user gets result when searching for valid author
    Given User navigates to RedShelf home page
    When User searches for "Mark Twain"
    Then User should see "Mark Twain" in result list

  @searchNegative
  Scenario: Verify user gets error message when searching for invalid author
    Given User navigates to RedShelf home page
    When User searches for "@#$%&*)!"
    Then User should see the "Oh No!" error message
