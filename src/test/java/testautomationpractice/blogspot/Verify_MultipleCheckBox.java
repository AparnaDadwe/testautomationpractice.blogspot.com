package testautomationpractice.blogspot;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

import pages.DonateMcPage;
import pages.MeoClinicHomePage;

public class Verify_MultipleCheckBox {
	
	WebDriver driver;
	
	DonateMcPage mcPage;
	@BeforeMethod
	public void setUp() {
		 driver=new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
	    driver.manage().window().maximize();
	  
	    mcPage=new DonateMcPage(driver);
	}
	@Test
	public void verifyCheckBox() {
		
		mcPage.multipleCheckBox();
			}
	
}
