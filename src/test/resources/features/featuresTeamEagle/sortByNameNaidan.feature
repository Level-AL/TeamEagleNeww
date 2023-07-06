Feature: Top Deals drop down sorting


	  Scenario: Top Deals drop down sorting
    Given Run Petco Login Steps
    When click on Deal tab
    Then  click on Top Deals
    And  click on Sort By tab 
    Then click on Name A to Z option
    And Verify sorting from A to Z