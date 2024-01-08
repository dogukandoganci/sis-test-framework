package com.neotech.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StudentsPageValidationSteps extends CommonMethods {
	
	@When("I navigated to Students tab")
	public void i_navigated_to_students_tab() {
	    click(mainPage.students);
	}
	@Then("I validated that all tabs are visible")
	public void i_validated_that_all_tabs_are_visible(DataTable dataTable) {
	    List<Map<String, String>> tabNameList=dataTable.asMaps();
	    for(Map<String, String> map:tabNameList) {
	    	System.out.println(map);
	    	String subTab=map.get("SubTab");
	    	WebElement subTabElement;
	    	if (subTab.equals("Personal")) {
                // Use the special XPath for this subtab
                subTabElement = driver.findElement(By.xpath("//span[text()='Personal']"));
            } else {
                // Use the general XPath for other subtabs
                subTabElement = driver.findElement(By.xpath("//a[text()='"+subTab+"']"));
            }
	    	
	    	Assert.assertTrue("Sub tab "+subTab+" is not visible",subTabElement.isDisplayed());
	             // Optional: Handle the case when there is no next subtab (if needed)
	             System.out.println("No more subtabs to click");
	             
	         }
	    
	    	////span[text()='Personal']
	    }
}
