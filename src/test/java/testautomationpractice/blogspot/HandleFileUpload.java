package testautomationpractice.blogspot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUpload {

	public static void main(String[] args) {
		 WebDriver driver=   new ChromeDriver();
		    
		    driver.get("https://testautomationpractice.blogspot.com/");
		    
		    driver.manage().window().maximize();
			   WebElement iframeElement= driver.findElement(By.xpath("//iframe[@id='frame-one1434677811']"));
			      driver.switchTo().frame(iframeElement);
WebElement browse=	driver.findElement(By.xpath("//input[@id='RESULT_FileUpload-10']"));
	browse.sendKeys("C:\\Users\\aparn\\OneDrive\\Pictures\\Screenshots");
	
System.out.println("File Uploaded Successfully");
	}

}
