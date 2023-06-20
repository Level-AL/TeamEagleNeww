Feature: Login Functionality

	Background:
	 Given the user is on the login page
  Scenario: Successful Login
    When the user enters valid credentials
	  And clicks on the login button
	  Then the user should be logged in successfully

 