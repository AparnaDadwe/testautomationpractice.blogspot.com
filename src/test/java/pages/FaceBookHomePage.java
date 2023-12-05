package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testautomationpractice.Utility;
public class FaceBookHomePage {
	
	WebDriver driver;
	WebElement uName;
	WebElement uPassword;
	WebElement loginButton;
	
	public FaceBookHomePage(WebDriver driver) {
		this.driver=driver;
		
	}

	public WebElement getuName() {
		setuName();
		return uName;
	}

	public void setuName() {
		this.uName = driver.findElement(By.xpath("//input[@name='email']"));
	}

	public WebElement getuPassword() {
		setuPassword();
		return uPassword;
	}

	public void setuPassword() {
		this.uPassword = driver.findElement(By.xpath("//input[@name='pass']"));
	}
   
	public WebElement getloginButton() {
		setloginButton();
		return uPassword;
	}

	public void setloginButton() {
		this.uPassword = driver.findElement(By.xpath("//button[@name='login']"));
	}
	
	public void textInUserTextBox() {
		getuName().sendKeys(Utility.getProperty("userName"));
		getuPassword().sendKeys(Utility.getProperty("passWord"));
	}
    public void clickOnLoginBtn() {
    	getloginButton().click();
    }
	
}
