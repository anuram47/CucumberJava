Feature: feature to test google search functionality

  Scenario: Validate google search is working
    Given browser is opened
    And user is on google search page
    When user enters a text in searchbox
    And hits enter
    Then user is navigated to search results
