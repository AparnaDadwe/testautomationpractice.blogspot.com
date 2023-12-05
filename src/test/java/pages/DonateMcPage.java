package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DonateMcPage {
	
	WebDriver driver;
	public DonateMcPage(WebDriver driver) {
	this.driver=driver;
	
}
	
public void  multipleCheckBox() {
	
	List<WebElement> checkBoxFields=driver.findElements(By.xpath("//form[normalize-space()='Automation Testing Performance Testing']"));
  System.out.println("No of CheckBox is"+checkBoxFields.size());
   
  //multiple click check list
  for(WebElement checkLi:checkBoxFields) {
		  checkLi.click();
	  }
 
}	
}


