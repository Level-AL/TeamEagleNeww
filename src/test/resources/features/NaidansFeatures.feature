Feature: Shop Now ad is clickable
  Scenario Background: 
  Given Run Petco Login Steps

  @Test1
  Scenario: Top Deals drop down sorting
    When click on Deal tab
    Then click on Shop Now
    And Verify that user is able to click on Shop Now

  @Test2
  Scenario: Top Deals drop down sorting
    When click on Deal tab
    Then click on Top Deals
    And click on Sort By tab
    Then click on Name A to Z option
    And Verify sorting from A to Z

  @Test3
  Scenario: Verifying the ad in Deals feature is scrolable
    When click on Deal tab
    Then click Weekly ad
    And user can see the weekly ad page
    Then scroll the page downwards
    And Verify that weekly ads page is scrollable
