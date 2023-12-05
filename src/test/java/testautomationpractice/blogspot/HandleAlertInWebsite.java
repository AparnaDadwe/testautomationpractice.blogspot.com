package testautomationpractice.blogspot;
//How to handle alert in web page
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertInWebsite {

	public static void main(String[] args) {
	
		   WebDriver driver=   new ChromeDriver();
		    
		    driver.get("https://testautomationpractice.blogspot.com/");
		    
		    driver.manage().window().maximize();
		    
		    driver.findElement(By.xpath("//button[text()=\"Click Me\"]")).click();
		    
		    //switch to alert first then we can get text and accept and dismiss
		 Alert  alt= driver.switchTo().alert();
		 
	System.out.println(alt.getText());
		 
		 alt.accept();

	}

}
