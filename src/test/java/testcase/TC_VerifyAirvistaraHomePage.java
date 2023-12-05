package testcase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.FlightHomePage;
import testautomationpractice.Utility2;

public class TC_VerifyAirvistaraHomePage {
	
WebDriver driver;
	
	FlightHomePage fHomePage;
	@BeforeMethod
	public void setUp() {
		driver=Utility2.getDriver();
		driver.get("https://www.airvistara.com/in/en");
		fHomePage=new FlightHomePage(driver);
	}
	@Test
	public void VerifyAirvistaraHomePage() {
//		fHomePage.getPageTitle();
//		assertEquals(fHomePage.getPageTitle(), "Book Flights & Check In Online | Vistara");
		
		//test case for Default value is selected on  dropDown is display
		assertTrue(fHomePage.getButtonSelectCountry().isDisplayed());
		
		//Test case for select value from dropdown
		
		fHomePage.getButtonSelectCountry();
		fHomePage.selectCountry("France");
		
		//test case for default value of language in dropdown
		assertTrue(fHomePage.getButtonSelectLanguage().isDisplayed());
		
		//test case Verify all values added in the dropdown list or not.
		
		
	}

}
