Feature: petco Search

 Scenario: Search for small pet
    Given I am on the Petco website
    When I search for "small pet"
    Then I should see search results related to "small pet"
    
  Scenario: Small pet same day delivery items displayed
    Given I am on the Petco website
    When I search for "small pet food"
    Then I should see search results related to "small pet food"
    And I click on same day delivery tab under Category
    Then I should see search results related to "small pet food" under same day delivery category
    Then I should scroll down
    Then I should see the other items while scrolling down related to "small pet food"
    
  Scenario: Look for small pet in Categories triple bar 
    Given I am on the Petco website
    When  I open triple bar icon
    Then I click on small pet tab
    Then I should see the sub page related to small pet