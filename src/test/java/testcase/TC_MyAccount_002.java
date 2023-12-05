package testcase;

import org.testng.annotations.Test;

import pages.BaseClass;
import pages.HomePage;



public class TC_MyAccount_002 extends BaseClass {
	
	@Test
	public void clickOnMyAccount() {
		
		driver.get(baseUrl);
		HomePage homPage=new HomePage(driver);
		homPage.clickOnMyAccount();
	
	}

}
