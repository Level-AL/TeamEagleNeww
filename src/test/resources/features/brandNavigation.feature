Feature: Navigation Feature
    
    Background:
    Given the user is on Home Page
    
    Scenario: Successful Brand Navigation
    When the user clicks on Shop Menu
    And the user clicks on Shop By Brand menu
    And the user clicks on brand Whole Hearted
    Then the user should be able to navigate to the Whole Hearted page