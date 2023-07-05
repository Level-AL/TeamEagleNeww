



Feature: Search Bar
  
  Scenario: Search Bar Functionality 
   Given User is on the homePage
   And clicks on search bar
   And user enter valid search term dog food
 	 And user clicks yellow search button on bar
   Then verify landing on dog food page
