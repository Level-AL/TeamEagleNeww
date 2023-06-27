Feature: Verifying Toggler functionality on Bird category 

Background:
Given User logged in and can see the homepage


@test1
Scenario: Successful checkout for a bird product
When User navigate to the bird category
And User add a bird product to the cart
And Verify User on the Checkout page
Then User Fillup the required Detail for Checkout

@test2
 Scenario: Cage  Sort by different criteria(price,colr.. etc)
 
 When Go to the Bird Category and Click on Cages & Cage covers
 And Sort by price ,color and other criteria
 Then  User Can See the Result of the Items
 When Select the item,Change Quantity,Size 
 And Add to the shopping Cart
 Then  View the Cart and checkout page
 
@test3
 Scenario: find Bird Cages by SearchBar
 
 When the user enter in the search bar
 And click on the search button
 Then the user should see search results
 And user sort the items
 When User finalize & click on item 
 Then user can see the detail-description
 And Add item to the cart



