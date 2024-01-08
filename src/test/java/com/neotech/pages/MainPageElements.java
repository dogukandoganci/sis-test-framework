package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class MainPageElements extends CommonMethods {

	@FindBy(id="lUser")
	public WebElement accountName;
	
	@FindBy(id="Header1_imgSchoolLogo")
	public WebElement logo;
	
	@FindBy(xpath="//table[@class='blockMid']")
	public WebElement announcements;
	
	@FindBy(xpath="//a[text()='Students']")
	public WebElement students;
	
	
	public MainPageElements() {
		PageFactory.initElements(driver, this);
	}
}
