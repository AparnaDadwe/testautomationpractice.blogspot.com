package testNgTestCasePractice;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TestCaseCheckTitle {
WebDriver driver;
SoftAssert softassert;
	@BeforeMethod 
	public void setUp() {
		
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		softassert = new SoftAssert();
		
	}
	@Test
	public void verifyTitle() {
		
	String expTitle = "Automation Testing Practice";
	String actTitle= driver.getTitle();
	System.out.println(actTitle);
	softassert.assertEquals(actTitle, expTitle);
//	softassert.assertNotEquals(actTitle, expTitle);
	
	WebElement butENabled=driver.findElement(By.xpath("//input[@id='FSsubmit']"));
	assertTrue(butENabled.isEnabled());
	softassert.assertAll();
		
	}
	
	public void tearDown() {
		driver.quit();
	}

}
