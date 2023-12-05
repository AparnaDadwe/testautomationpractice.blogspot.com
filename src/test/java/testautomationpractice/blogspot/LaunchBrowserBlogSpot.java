package testautomationpractice.blogspot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserBlogSpot {

	public static void main(String[] args) {
		
		    WebDriver driver=   new ChromeDriver();
		    
		    driver.get("https://testautomationpractice.blogspot.com/");
		    
		    driver.manage().window().maximize();
		
	}

}
