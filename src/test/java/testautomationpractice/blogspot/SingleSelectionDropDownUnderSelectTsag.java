package testautomationpractice.blogspot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectionDropDownUnderSelectTsag {

	public static void main(String[] args) {
		   WebDriver driver=   new ChromeDriver();
		    
		    driver.get("https://testautomationpractice.blogspot.com/");
		    
		    driver.manage().window().maximize();
		    
		  WebElement singleDropDownSelction=  driver.findElement(By.xpath("//select[@id='products']"));
		    
		    Select selectOption= new Select(singleDropDownSelction);
		    List<WebElement> mutipleOptions=selectOption.getOptions();
		    for(WebElement options:mutipleOptions) {
		    	
		    	System.out.println(options.getText());
		    }
		    selectOption.isMultiple();
		   selectOption.selectByIndex(2);
		   selectOption.selectByValue("Apple");
		   selectOption.selectByVisibleText("Bing");
	
	}

}
