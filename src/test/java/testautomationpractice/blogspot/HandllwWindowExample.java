package testautomationpractice.blogspot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandllwWindowExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.findElement(By.xpath("//a[text()='Demo']")).click();
		
		
		System.out.println(driver.getTitle());
		
	}

}
