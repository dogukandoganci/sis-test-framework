@LoginAndHomePage
Feature: Login and Home Page Validation


Scenario: Valid Login
When I logged in with valid credentials
Then I validate that logged in
Then I validate that announcement section is visible
Then I validate that the url includes the "MainPage.aspx" extension.
