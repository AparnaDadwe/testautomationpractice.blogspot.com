package testautomationpractice.blogspot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testautomationpractice.Utility;

public class TestCaseVerifyTitle {
	
	WebDriver driver;
	@BeforeMethod
	
	public void setup() {
		
		driver=new ChromeDriver();
		
	     driver.get(Utility.getProperty("url"));
		
	}
	
	@Test
	public void verifyTitle() {
		
		System.out.println(driver.getTitle());
	}
	@Test
	
	public void verifyUrl() {
		
		System.out.println(driver.getCurrentUrl());
		
	}
	
	@AfterMethod
	
	public void tearDown() {
		
		Utility.getscreenShot(driver, "google"); 
		
	
	}

}
