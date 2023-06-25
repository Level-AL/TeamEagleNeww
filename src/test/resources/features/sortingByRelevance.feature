
	Feature: Sorting Feature
	
	Background:
	Given the user is at the Home Page
  
  Scenario: Successfully Sorting the Products by Relevance
    When the user clicks on Shop Menu at the Home Page
    And then clicks on the Shop By Brand
    And then clicks on the brand Whole Hearted
    And then adjusts the filter by setting the category as Dog
    And then selects the Same Day Delivery under the Get It Today section
    And then sets the Price Filter
    And then clicks on Sort By Relevance
    Then the user can see the relevant products
