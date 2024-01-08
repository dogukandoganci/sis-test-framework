@Enrollment
Feature: Enrollment Tab Validation

  @smoke
  Scenario: Validate Student Enrollment
    When I logged in with valid credentials
    And I navigated to Students tab
    When I found the student and filled the enroll information
    And I validate status enrollment tab
    Then I validate enrollment subtab
