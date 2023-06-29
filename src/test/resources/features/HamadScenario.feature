Feature: verifying petco website Functionality 


Background:
	 Given the user is on the login page

 Scenario: Verify user can add item to cart and complete checkout
    When I log in with valid username and password
    And I select a product from the website
    And I click on the "Add to Cart" button
    Then the item should be added to the cart successfully
    And I go to the Checkout page
    And I fill up the card details with valid information
    And I complete the checkout process
    
    
    
    Scenario: Adding item to the cart
    When the user enters valid credentials
    And clicks on the login button
    Then the user should be logged in successfully
    Then User should search iteam in the search bar 
    Then Click on  any iteam
    Then Click on the cart
    Then Iteam should be available
    
    
    
     Scenario: Verify cart is empty after removing items
    When I log in with valid username and password
    Then User should search iteam in the search bar 
    Then Click on  any iteam
     Then Click on the cart
     And I remove all items from the cart
    Then I should see an empty cart
    
    
    
    
    