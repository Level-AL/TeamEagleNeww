Feature: Verifying Toggler functionality on Bird category 

Background:
Given User logged in and can see the homepage


@testCase1
Scenario: Successfully add bird product to the Cart
When User navigate to the bird category
And User add a bird product to the cart
And User are able increase the quantity
Then Verify user can save the item for later

@testCase2
 Scenario: Filter Cage Result and remove item from Cart 
 
 When Go to the Bird Category and Click on Cages & Cage covers
 And Sort by price ,color and other criteria
 Then  User Can See the Result of the Items
 When Select the item,Change Quantity,Size 
 And Add to the shopping Cart
 Then  View the Cart and remove items
 
@testCase3
 Scenario: Verifying added Bird Cages by SearchBar and Description
 
 When the user enter in the search bar
 And click on the search button
 Then the user should see search results
 And user sort the items
 When User finalize & click on item 
 Then user can see the detail-description
 



