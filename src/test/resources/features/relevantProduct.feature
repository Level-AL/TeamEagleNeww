
	Feature: Relevant Product Feature
	
	Background:
	Given the user is at Home Page
  
  Scenario: Successful Product Info Display
		When user clicks on Shop Menu at the Home Page
    And clicks on the Shop By Brand
    And clicks on the brand Whole Hearted
    And adjusts the filter by setting the category as Dog
    And selects the Same Day Delivery under the Get It Today section
    And sets the Price Filter
    And clicks on Sort By Relevance and can see the relevant products  
    And clicks on the first product in the list pf products
    Then the user should be able to see the name price and description of the selected product