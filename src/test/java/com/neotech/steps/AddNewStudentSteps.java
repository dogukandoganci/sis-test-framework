package com.neotech.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewStudentSteps extends CommonMethods {
	@When("I click on add new")
	public void i_click_on_add_new() {
		waitForVisibility(students.addNew);
		click(students.addNew);
	}

	@When("I filled up all details except: local id, grade section, and username.")
	public void i_filled_up_all_details_except_local_id_grade_section_and_username() {
		sendText(students.stateId, "123123123123");
		sendText(students.lastName, "Doganci");
		sendText(students.middleName, "Dogukan");
		sendText(students.firstName, "Emir");
		sendText(students.ssn, "333-33-2222");
		sendText(students.email, "dogukandoganci7@gmail.com");
		sendText(students.birthDay, "06/16/1998");
		selectDropdown(students.gender, "Male");
		selectDropdown(students.lunchType, "Free");
		selectDropdown(students.ethnicityList, "Not Hispanic or Latino");
		selectDropdown(students.race, "White");
		selectDropdown(students.gradeLevel, "Graduated");
		sendText(students.password, "Dogukan1.");
		click(students.submitChanges);
		
	}


	@Then("I added photo")
	public void i_added_photo() {
		// WebElement newStudent=driver.findElement(By.xpath("//option[text()='Doganci
		// Emir']"));
		// click(newStudent);
		String window=driver.getWindowHandle();
		click(students.addPhoto);
		switchToChildWindow();
		driver.manage().window().maximize();
		String filePath = System.getProperty("user.dir") + "/testData/student.photo2.jpg";
		// click(students.fileUpload);
		sendText(students.fileUpload, filePath);
		click(students.uplaodPhoto);
		acceptAlert();
//		acceptAlert();
//		driver.switchTo().window(window);
//		click(students.submitChanges);
	
		
	}	

	@Then("I validate that new student added")
	public void i_validate_that_new_student_added() {
		String actual=getAlertText().trim();
		String expected="Successfully Added";
		acceptAlert();
		Assert.assertEquals(actual, expected);
		
		
	    }
	    		

}
