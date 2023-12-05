package testcase;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class TC_Login_001 extends BaseClass {
	@Test
	public void loginTest() {
		
		driver.get(baseUrl);
		HomePage homPage=new HomePage(driver);
		LoginPage loginPage=new LoginPage(driver);
		homPage.clickOnMyAccount();
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginBtn();
		
		//if login succesfull then check it display on account page 
		
		
			WebElement loginStatus=driver.findElement(By.className("woocommerce-MyAccount-content"));
		assertTrue(loginStatus.isDisplayed(), "Hello"+username);
//			System.out.println(loginStatus.isDisplayed());
	
		
	}

}
