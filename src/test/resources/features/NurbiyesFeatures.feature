Feature: Peptile page

   Scenario: navigate to reptile page 
 	  Given the user is on the home page
    When clicks on the menu 
    And hover over reptile tob and click on the Reptile 
    And verify that the page URL changes to the Reptile category page 
    Then confirm that the Reptile category page displays relevant reptile products and information
   
  
  Scenario: verify the dimensions of the product	
	 Given the user is on the reptile page 
 	 When Click on Frogshop on page 
    And user is on the frogshop page 
    And click on Zilla Bertical Tropical Kit product
    Then verify the dimensions of the product
  
  
   Scenario: Checkout and verify add credit card button
    Given the user is on the product page
    When click on Add To Cart 
    And navigate to cart page
    And click on Proceed To Checkout button 
    Then verify that add credit card button is visible 