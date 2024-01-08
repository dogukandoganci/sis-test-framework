@Student
Feature: Students Page Validation

  
  Scenario: Validate Students Page Tabs
    When I logged in with valid credentials
    And I navigated to Students tab
    Then I validated that all tabs are visible
      | SubTab               |
      | Personal             |
      | Academic             |
      | Parental             |
      | Override Final Grade |
      | Schedule             |
      | Discipline Stats     |
      | Personal 2           |
      | Enrollment           |
      | Notes                |
      | E-Portfolio          |
      | Program Enrollment   |
