@AddNewStudent
Feature: Add New Student Functionality

  
  Scenario: Validate New Student Added
    When I logged in with valid credentials
    And I navigated to Students tab
    When I click on add new
    When I filled up all details except: local id, grade section, and username.
    Then I validate that new student added
    
