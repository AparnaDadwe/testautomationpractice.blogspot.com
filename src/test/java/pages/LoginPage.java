package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver){
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(name="username")
	WebElement textUsername;
	
	@FindBy(name="password")
	WebElement textPassWord;
	
	@FindBy(name="login")
	WebElement btnLogin;
	
	//action method
	public void setUsername(String uname) {
		textUsername.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		textPassWord.sendKeys(pwd);
	}
	public void clickLoginBtn() {
		btnLogin.click();
	}

}
