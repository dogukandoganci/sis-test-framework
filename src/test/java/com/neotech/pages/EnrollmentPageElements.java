package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class EnrollmentPageElements extends CommonMethods {
	
	@FindBy(id="enrollCode_list")
	public WebElement enrollCode;
	
	@FindBy(id="enrollComment")
	public WebElement enrollComment;
	
	@FindBy(xpath="//input[@name='bEnroll']")
	public WebElement submitEnroll;
	
	@FindBy(id="enrollGradeSection_list")
	public WebElement gradeSection;
	
	@FindBy(id="enrollDate")
	public WebElement enrollDate;
	
	public EnrollmentPageElements() {
		PageFactory.initElements(driver, this);
	}
}
