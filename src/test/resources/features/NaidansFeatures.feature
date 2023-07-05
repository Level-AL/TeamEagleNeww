Feature: Shop Now ad is clickable

  Scenario: Top Deals drop down sorting
    Given Run Petco Login Steps
    When click on Deal tab
    Then click on Shop Now
    And Verify that user is able to click on Shop Now

  Scenario: Top Deals drop down sorting
    Given Run Petco Login Steps
    When click on Deal tab
    Then click on Top Deals
    And click on Sort By tab
    Then click on Name A to Z option
    And Verify sorting from A to Z

  Scenario: Verifying the ad in Deals feature is scrolable
    Given Run Petco Login Steps
    When click on Deal tab
    Then click Weekly ad
    And user can see the weekly ad page
    Then scroll the page downwards
    And Verify that weekly ads page is scrollable
