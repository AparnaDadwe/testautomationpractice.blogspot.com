package testautomationpractice.blogspot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testautomationpractice.JavaScriptUtil;

public class JavaScriptExecutorClick {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=JavaScriptUtil.getDriver();
		driver.get("https://demoqa.com/automation-practice-form");
	}
	@Test
	public void JavaScriptExecutorClickMethpd() {
		
		WebElement genderFRadioButton=driver.findElement(By.xpath("//input[@id='gender-radio-2']"));
		JavaScriptUtil.clickElementByJs(driver, genderFRadioButton);
		
	}

}
