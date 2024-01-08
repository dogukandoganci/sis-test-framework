package com.neotech.testbase;

import com.neotech.pages.EnrollmentPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.pages.MainPageElements;
import com.neotech.pages.StudentsPageElements;

public class PageInitializer extends BaseClass {
	public static LoginPageElements login;
	public static MainPageElements mainPage;
	public static StudentsPageElements students;
	public static EnrollmentPageElements enroll;
	
	public static void initialize() {
		
		login = new LoginPageElements();
		mainPage=new MainPageElements();
		students=new StudentsPageElements();
		enroll=new EnrollmentPageElements();
	}
}
