    Feature: Product Filtering, Brand Navigation, Sorting, and Product Info Display
  	
  	Background: 
    Given The user is on the Home Page
    
    @testCase01
    Scenario: Successful Filter Setting
    When the user clicks on the Shop Menu
    And the user clicks on Shop By Brand
    And the user clicks on the brand Whole Hearted
    And the user selects the Dog filter
    And the user clicks on the Same Day Delivery filter
    And the user selects the Price Range
    Then the user should see the accurate results
    
    @testCase02
    Scenario: Successful Brand Navigation
    When the user clicks on Shop Menu
    And the user clicks on Shop By Brand menu
    And the user clicks on brand Whole Hearted
    Then the user should be able to navigate to the Whole Hearted page
    
    @testCase03
    Scenario: Successfully Sorting the Products by Relevance
    When the user clicks on Shop Menu at the Home Page
    And then clicks on the Shop By Brand
    And then clicks on the brand Whole Hearted
    And then adjusts the filter by setting the category as Dog
    And then selects the Same Day Delivery under the Get It Today section
    And then sets the Price Filter
    And then clicks on Sort By Relevance
    Then the user can see the relevant products
    
    @testCase04
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
    