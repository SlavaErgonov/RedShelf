@searchPositive
Feature: RedShelf main features

  Scenario: Verify user gets result when searching for valid author
    When User is on RedShelf main page
    And User searches for Mark Twain
    Then User should see Mark Twain in result list

@searchNegative
#Feature:
#  Scenario:
