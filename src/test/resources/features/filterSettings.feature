		
    Feature: Filter Feature
  	
  	Background: 
    Given The user is on the Home Page
    	
    Scenario: Successful Filter Setting
    When the user clicks on the Shop Menu
    And the user clicks on Shop By Brand
    And the user clicks on the brand Whole Hearted
    And the user selects the Dog filter
    And the user clicks on the Same Day Delivery filter
    And the user selects the Price Range
    Then the user should see the accurate results