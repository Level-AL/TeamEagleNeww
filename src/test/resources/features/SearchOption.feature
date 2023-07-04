Feature: Petco Search Option
  

 
  Scenario: Checking Search Feature
    Given User is on the Home page
    When User enters a vlid dog product keyword
    And clicks on the search button
    Then user should navigate to the desired product page
    
 