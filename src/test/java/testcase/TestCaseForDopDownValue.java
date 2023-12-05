package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.FlightHomePage;
import testautomationpractice.Utility2;

public class TestCaseForDopDownValue {
	
	WebDriver driver;
	FlightHomePage fHomePage;
	@BeforeMethod
	public void setUp() {
		driver=Utility2.getDriver();
		driver.get("https://www.airvistara.com/in/en");
		fHomePage=new FlightHomePage(driver);
	}
	@Test
	public void selectCountryDropDown() {
		fHomePage.getButtonSelectCountry();
		fHomePage.selectCountry("France");
	}

}
