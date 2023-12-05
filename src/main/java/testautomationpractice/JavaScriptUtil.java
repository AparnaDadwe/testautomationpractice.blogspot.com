package testautomationpractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptUtil {
	WebDriver driver;
	public static  WebDriver  getDriver() {
		
		WebDriver driver=new ChromeDriver();
		return driver;
	}
	public static  void clickElementByJs(WebDriver driver, WebElement element) {
		//click action
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);	
		
	}
}

