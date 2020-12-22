@searchTitle
Feature: RedShelf main features

  Scenario: RedShelf search title verification
    When User is on RedShelf main page
    And User searches for Mark Twain
    Then User should see Mark Twain in title


#Feature:
#  Scenario:
