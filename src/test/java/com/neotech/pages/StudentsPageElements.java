package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class StudentsPageElements extends CommonMethods{
	
	@FindBy(id="bAdd")
	public WebElement addNew;
	
	@FindBy(id="tStateId")
	public WebElement stateId;
	
	@FindBy(id="tLastName")
	public WebElement lastName;
	
	@FindBy(id="tFirstName")
	public WebElement firstName;
	
	@FindBy(id="tMiddleName")
	public WebElement middleName;
	
	@FindBy(id="tSuffix")
	public WebElement suffix;
	
	@FindBy(id="tSSN")
	public WebElement ssn;
	
	@FindBy(id="tEmail")
	public WebElement email;
	
	@FindBy(id="tBirthDay")
	public WebElement birthDay;
	
	@FindBy(id="gender_list")
	public WebElement gender;
	
	@FindBy(id="lunchType")
	public WebElement lunchType;
	
	@FindBy(id="ddEthnicity_list")
	public WebElement ethnicityList;
	
	@FindBy(id="ddRaceNew")
	public WebElement race;
	
	@FindBy(id="tLabel")
	public WebElement label;
	
	@FindBy(id="cGradeLevel_list")
	public WebElement gradeLevel;
	
	@FindBy(id="tPassword")
	public WebElement password;
	
	@FindBy(id="tParent")
	public WebElement primaryParent;
	
	@FindBy(id="tAddress")
	public WebElement address;
	
	@FindBy(id="tAddress2")
	public WebElement address2;
	
	@FindBy(id="tCity")
	public WebElement city;
	
	@FindBy(id="tState")
	public WebElement state;
	
	@FindBy(id="tZip")
	public WebElement zip;
	
	@FindBy(id="tHomePhone")
	public WebElement homePhone;
	
	@FindBy(id="tBusInfo")
	public WebElement busInfo;
	
	@FindBy(id="photoChange")
	public WebElement addPhoto;
	
	@FindBy(xpath="//input[@value='Submit Changes']")
	public WebElement submitChanges;
	
	@FindBy(xpath="//a[text()='Parental']")
	public WebElement parantelTab;
	
	@FindBy(id="bSubmit")
	public WebElement uplaodPhoto;
	
	@FindBy(id="fileUpload")
	public WebElement fileUpload;
	
	@FindBy(id="sImage")
	public WebElement photo;
	
	@FindBy(id="bStatusChange")
	public WebElement enroll;
	
	@FindBy(id="studentStatus_list")
	public WebElement status;
	
	@FindBy(xpath="//a[text()='Enrollment']")
	public WebElement enrollmentTab;
	
	public StudentsPageElements() {
		PageFactory.initElements(driver, this);
	}
	
	
}
