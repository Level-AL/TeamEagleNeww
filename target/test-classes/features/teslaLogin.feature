Feature: Testing the login functionality of tesla.com

  Background: 
  Given The user is on the login page
   
  Scenario: Successful Login
    When the user enters correct login credentials
    And clicks on the login button
    Then the user should be logged in successfully
  
