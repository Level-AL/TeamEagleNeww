Feature: verifying cart functionality 
Background:
	 Given the user is on the login page

    @test1
    Scenario: Adding item to the cart
    When I log in with valid username and password
    Then the user should be logged in successfully
      And I select a product from the website
    Then the item should be added to the cart successfully
    
    
    @test2
     Scenario: Verify cart is empty after removing items
    When I log in with valid username and password
      And I select a product from the website
    And I click on the "Add to Cart" button
     And I remove all items from the cart
    Then I should see an empty cart 

@test3
Scenario: Verify user can add item to cart and complete checkout
    When I log in with valid username and password
    And I select a product from the website
    And I click on the "Add to Cart" button
    Then the item should be added to the cart successfully
    And I go to the Checkout page
    And I fill up the card details with valid information
    And I complete the checkout process
    