Feature: Verifying Toggler functionality on Bird category 

Background:
Given User logged in and can see the homepage


@testCase1
Scenario: Successful checkout for a bird product
When User navigate to the bird category
And User add a bird product to the cart
And User are able increase the quantity
Then Verify user can save the item for later

@testCase2
 Scenario: Cage  Sort by different criteria(price,colr.. etc)
 
 When Go to the Bird Category and Click on Cages & Cage covers
 And Sort by price ,color and other criteria
 Then  User Can See the Result of the Items
 When Select the item,Change Quantity,Size 
 And Add to the shopping Cart
 Then  View the Cart and remove items
 
@testCase3
 Scenario: find Bird Cages by SearchBar
 
 When the user enter in the search bar
 And click on the search button
 Then the user should see search results
 And user sort the items
 When User finalize & click on item 
 Then user can see the detail-description
 



