package testautomationpractice.blogspot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlerBoxHandle {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
	}
		
		
	@Test
	public void alertHamdle() throws InterruptedException  {	
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("53920");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//handle alert msg
		
		Alert  alertHandle=driver.switchTo().alert();
		alertHandle.accept();
		Thread.sleep(1000);
		Alert  alertHandle2=driver.switchTo().alert();
		alertHandle2.accept();
		
	}
   
}
