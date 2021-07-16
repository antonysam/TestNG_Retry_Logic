package com.orangeHRM.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class orangeHRM_login {
	By element = By.id("logInPanelHeading");
    
	@BeforeMethod
	public void setup() {
	
		Golden_template.openbrowser("chrome-pom");
		Golden_template.getURL("https://opensource-demo.orangehrmlive.com/", 10, 10);
	}
	
	@Test
	public void validate() {
		Golden_template.ValidatePageTitle("sam");
	}
	
	@Test
	public void validatewebelement() {
		Golden_template.ValidateText(element, "sam");
	}
	
	@AfterMethod
	public void teardown() {
		Golden_template.closebrowser();
	}
}
