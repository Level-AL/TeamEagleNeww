Feature: Petco SearchBar Functionality
  Scenario Background:
  Given I am on the Petco website

  @Test1
  Scenario: Search for small pet
    When I search for "small pet"
    Then I should see search results related to "small pet"

  @Test2
  Scenario: Small pet same day delivery items displayed
    When I search for "small pet food"
    Then I should see search results related to "small pet food"
    And I click on same day delivery tab under Category
    Then I should see search results related to "small pet food" under same day delivery category
    Then I should scroll down
    Then I should see the other items while scrolling down related to "small pet food"

  @Test3
  Scenario: Look for small pet in Categories triple bar
    When I open triple bar icon
    Then I click on small pet tab
    Then I should see the sub page related to small pet
