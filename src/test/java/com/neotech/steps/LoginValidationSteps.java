package com.neotech.steps;


import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginValidationSteps extends CommonMethods {
	
	
	@When("I enter a valid username")
	public void i_enter_a_valid_username() {
	    sendText(login.username, ConfigsReader.getProperty("username"));
	}
	@When("I enter a valid password")
	public void i_enter_a_valid_password() {
		sendText(login.password, ConfigsReader.getProperty("password"));
	}
	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		click(login.loginButton);
	}
	@Then("I validate that I am logged in")
	public void i_validate_that_i_am_logged_in() {
		String expected = "Administrator";
		String actual= mainPage.accountName.getText();
		
		if(actual.equals(expected)) {
			System.out.println("Test Passed!");
		}else {
			System.out.println("Test Failed!");
		}
	}
	
	@When("I leave the password field empty")
	public void i_leave_the_password_field_empty() {
		sendText(login.password, "");
	}
	@Then("I validate that password cannot be empty")
	public void i_validate_that_password_cannot_be_empty() {
		String expected = "Please fill required fields";
		String actual=getAlertText();
		
		if(actual.equals(expected)) {
			System.out.println("Test Passed!");
		}else {
			System.out.println("Test Failed!");
		}
		
		acceptAlert();
	}
	
	@When("I enter an invalid password")
	public void i_enter_an_invalid_password() {
		sendText(login.password, "");
		
	}
	@Then("I validate that password is invalid")
	public void i_validate_that_password_is_invalid() {
		String expected = "Either username and password do not match or your account doesn't have  access for the selected Academic Year.";
		String actual=getAlertText();
		
		if(actual.equals(expected)) {
			System.out.println("Test Passed!");
		}else {
			System.out.println("Test Failed!");
		}
		
		acceptAlert();
	
	}

}
