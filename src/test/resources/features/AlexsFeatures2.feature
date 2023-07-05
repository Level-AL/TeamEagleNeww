	 
	 
	 
	 Feature: Login
	 
	  
  Scenario: Login Functionality
    Given User is on the login page 
    And user fills in valid email and password
    And user clicks button sign in
    Then verify that homePage is showing 