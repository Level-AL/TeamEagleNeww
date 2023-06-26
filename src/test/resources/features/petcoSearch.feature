Feature: petco Search

 Scenario: Search for small pet
    Given I am on the Petco website
    When I search for "small pet"
    Then I should see search results related to "small pet"
    