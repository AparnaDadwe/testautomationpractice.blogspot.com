package testautomationpractice.blogspot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		WebElement frameId=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frameId);
	WebElement headingText=	driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
	System.out.println(headingText.getText());

	}

}
