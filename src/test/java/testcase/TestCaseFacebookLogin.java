package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.FaceBookHomePage;

import testautomationpractice.Utility;

public class TestCaseFacebookLogin {
	
WebDriver driver;
FaceBookHomePage fbhomePage;	
	
	@BeforeMethod
	public void setUp() {
		driver=Utility.getDriver();
		driver.get(Utility.getProperty("url"));
		driver.manage().window().maximize();
		fbhomePage=new FaceBookHomePage(driver);
	}
	@Test
	public void verifyFbLogin() {
//		fbhomePage.getuName().sendKeys(Utility.getProperty("userName"));
//		fbhomePage.getuPassword().sendKeys(Utility.getProperty("passWord"));
//		fbhomePage.getloginButton().click();
		fbhomePage.textInUserTextBox();
		fbhomePage.clickOnLoginBtn();
	}

}
