Feature: NavigationPage

  Scenario: Cat page Navigation Test
    Given you are on the petco.com website
    And I Click on navigation menu bar on the page
    Then I Click on the cat option in the navigation menu.
    And I Verify that the correct page loads

  Scenario: Click on product in cats subpage
    Given you are on the petco.com website
    And I Click on navigation menu bar on the page
    Then I Click on the cat option in the navigation menu.
    And Select a specific cat product and click on it
    Then Verify that the product details page loads successfully

  Scenario: Title of your scenario
    Given you are on the petco.com website
    And I Click on navigation menu bar on the page
    Then I Click on the cat option in the navigation menu.
    And Select Clothes & Accessories  under Supplies Category and click it
    Then Select Color filter and click it
    Then Click on the color Black

