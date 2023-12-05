package testautomationpractice.blogspot;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleTarget {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.target.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//a[@aria-label='Account, sign in']")).click();
		driver.findElement(By.xpath("//span[@class='styles__ListItemText-sc-diphzn-1 eOhzvD'][normalize-space()='Sign in']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Target terms and conditions']")).click();
		  String parentWindowHandle= driver.getWindowHandle();
		        Set<String> allWindowHandle=driver.getWindowHandles();
		        for(String handle:allWindowHandle) {
		        	if(!(handle.equals(parentWindowHandle))) {
		        		driver.switchTo().window(handle);
		        		
		        	}
		        }
		WebElement textTermsAndCondition=driver.findElement(By.xpath("//h1[@class='styles__StyledHeading-sc-1xmf98v-0 zEoI']"));
		System.out.println(textTermsAndCondition.getText());
	   //System.out.println(driver.getTitle());
//		driver.switchTo().defaultContent();
//        System.out.println(driver.getTitle());
		
	}

}
