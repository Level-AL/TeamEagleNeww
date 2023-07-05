Feature: Gift Card
	
  
  Scenario: Gift Card Process
    Given user is on the homePage
    And user clicks on the hamburgerMenu button
    And user click new/trending 
    And user clicks GiftCards
    And user fills in required info 
    And user clicks ContinueWithPurchase
    #And user fills in their name and your name 
    #And user clicks SendADigitalCard
    And user clicks HowMuch
    And user clicks $100 amount
    And user clicks Add a message 
    And user adds personalized message
    And user clicks where is it going 
    And user fills email and confirms email
    And user clicks add to cart
    Then verify that Checkout button is shown on screen



