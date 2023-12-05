package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseUrl="https://practice.automationtesting.in/";
	public String username="dadwePushpa24@gmail.com";
	public String password="Dadwe@1234";
	public static WebDriver driver;
	@BeforeClass
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver= new ChromeDriver();
		
		
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
