
Feature: Dog Category presence, Dog page loading,Product search and login funtionality
  
Background:
Given User is on petco.com home page 
@testcase01
Scenario: Verify Dogs Category is displayed in the navigation menu.
When User locates the navigation menue and clicks on it
Then Dog Category should be displayed in the navigation menue


@testcase02
Scenario: Verify that DOG page loads successfully

When User locates navigation menu and clicks on it
And User locates DOG page button and hover over it
And User locates DOG page Headings and clicks on it
Then user should navigate to DOG page successfully

@testcase03
Scenario: Checking Search Feature
When User enters a vlid dog product keyword
And clicks on the search button
Then user should navigate to the desired product page

#@testcase04
#Scenario: Successful Login
#Given the user is on the login page
#When the user enters valid credentials
#And clicks on the login button
#Then the user should be logged in successfully
