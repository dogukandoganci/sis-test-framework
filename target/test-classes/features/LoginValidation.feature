@Login
Feature: Login Functionality

  
  Scenario: Valid Login
    When I enter a valid username
    And I enter a valid password
    And I click on the login button
    Then I validate that I am logged in

  
  Scenario: Blank Password
    When I enter a valid username
    And I leave the password field empty
    And I click on the login button
    Then I validate that password cannot be empty

	
  Scenario: Invalid Password
    When I enter a valid username
    And I enter an invalid password
    And I click on the login button
    Then I validate that password is invalid
