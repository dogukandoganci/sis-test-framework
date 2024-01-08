package com.neotech.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EnrollmentSteps extends CommonMethods{
	@When("I found the student and filled the enroll information")
	public void i_found_the_student_and_filled_the_enroll_information() {
	    selectDropdown(students.status, "Unenrolled");
	    click(driver.findElement(By.xpath("//option[text()='Doganci Emir']")));
	    click(students.enroll);
	    switchToChildWindow();
	    sendText(enroll.enrollDate, "1/6/2024");
	    //selectDropdown(enroll.enrollCode, "01 - Enrolled");
	    sendText(enroll.enrollComment, "--");
	    click(enroll.submitEnroll);
	    
	    
	}
	@When("I validate status enrollment tab")
	public void i_validate_status_enrollment_tab() {
	    
		String expected=students.status.getText();
		System.out.println(expected);
//		String actual="Enrolled";
//		Assert.assertEquals(expected, actual);
		
	}
	@Then("I validate enrollment subtab")
	public void i_validate_enrollment_subtab() {
	   
		click(students.enrollmentTab);
		selectDropdown(students.status, "Enrolled");
		WebElement el=driver.findElement(By.xpath("//option[text()='Doganci Emir']"));
		Assert.assertTrue(el.isDisplayed());
		
	}
}
