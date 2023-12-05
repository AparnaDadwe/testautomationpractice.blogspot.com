package testNgTestCasePractice;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTestClass {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Test
	public void veriFyUrl() {
	     assertNotEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/");
		}
	@Test
	public void homePageTitleTest() {
		assertEquals(driver.getTitle(), "OrangeHRM");	
	
}
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
}