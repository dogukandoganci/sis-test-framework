package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAndHomePageValidationSteps extends CommonMethods {
	@When("I logged in with valid credentials")
	public void i_logged_in_with_valid_credentials() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginButton);
	}
	@Then("I validate that logged in")
	public void i_validate_that_logged_in() {
	    
		Assert.assertEquals("Logo is not visible", mainPage.logo.isDisplayed(), true);
	}
	@Then("I validate that announcement section is visible")
	public void i_validate_that_announcement_section_is_visible() {
	    
		Assert.assertEquals("Announcement section is not visible", mainPage.announcements.isDisplayed(), true);
	}
	@Then("I validate that the url includes the {string} extension.")
	public void i_validate_that_the_url_includes_the_extension(String expectedURL) {
	    
		String currentURL=driver.getCurrentUrl();
		Assert.assertTrue("URL dOes not contain the mainpage extension!", currentURL.contains(expectedURL));
	}
}
