package testautomationpractice.blogspot;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonTextInWebPage {

	public static void main(String[] args) {
		
		WebDriver driver=	new ChromeDriver();
		
	     driver.get("https://testautomationpractice.blogspot.com/");
	     
	     driver.manage().window().maximize();
	     
	     //to get text on button we will use list interface
	     
	     List<WebElement>    button   = driver.findElements(By.xpath("//button[text()]"));
	     
	       Iterator<WebElement>   itr      = button.iterator();
	       
	       System.out.println("Number of buttons " +button.size());
	       
	       while(itr.hasNext()) {
	    	   
	    	   WebElement elm=itr.next();
	    	   System.out.println(elm.getText());
	       }
	
	}

}
