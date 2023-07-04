Feature: Login Functionality and Test Weekly Aid


	  Scenario: Verifying the ad in Deals feature is scrolable
    Given Run Petco Login Steps
    When click on Deal tab
    Then  click Weekly ad
    And  user can see the weekly ad page 
    Then scroll the page downwards
    And Verify that weekly ads page is scrollable