package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MeoClinicHomePage {
	
	WebDriver driver;
		public MeoClinicHomePage(WebDriver driver) {
		this.driver=driver;
		
	}
		
    public void clickOnDonate() {
   WebElement donateLink= 	driver.findElement(By.xpath("//a[@data-cmp-data-layer='{\"target\":\"Donate\",\"category\":\"global-header\",\"action\":\"top_header\"}']//span[@aria-hidden='false']//span//span//span[@role='text'][normalize-space()='Donate']"));
   donateLink.click();
    }		
		
		

}
