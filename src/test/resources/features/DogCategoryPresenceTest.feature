Feature: Dog Category Presence Test
  

  
Scenario: Verify  Dogs Category is displayed in the navigation menu.
    Given User is on the petco.com Home page
    When User locates the navigation menue and clicks on it
    Then Dog Category should be displayed in the navigation menue 
    

 