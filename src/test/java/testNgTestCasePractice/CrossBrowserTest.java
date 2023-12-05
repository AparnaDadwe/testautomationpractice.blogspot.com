package testNgTestCasePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
    public void launchApp(String browser) {
    	if(browser.equalsIgnoreCase("Chrome")) {
    		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    		driver=new ChromeDriver();
    	}
    	else if(browser.equalsIgnoreCase("Edge")){
    		System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver.exe");
   		 driver =new EdgeDriver(); 
    	}
    	else if(browser.equalsIgnoreCase("FireFox")) {
    		System.setProperty("webdriver.firefox.driver", "src/test/resources/geckodriver.exe");
    		driver=new FirefoxDriver();
    	}
    	driver.manage().window().maximize();
    	driver.get("https://www.target.com/");
    }
	@Test
	public void textinSearchBox() {
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Baby Diaper");
	}
	
	
	
}
