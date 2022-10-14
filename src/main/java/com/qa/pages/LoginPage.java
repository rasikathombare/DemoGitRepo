package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	//OR
	@FindBy(name = "email")
	WebElement username;
	@FindBy(name="password")
	WebElement pswd;
	
	public void verifylogin() {
		
		System.out.println("login");
	}
}
