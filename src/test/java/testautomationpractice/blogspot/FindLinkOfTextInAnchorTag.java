package testautomationpractice.blogspot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinkOfTextInAnchorTag {

	public static void main(String[] args) {
		
		     WebDriver driver=  new ChromeDriver();
		       driver.get("https://testautomationpractice.blogspot.com/");
		       
		       driver.manage().window().maximize();
		       
		     //to find multiple hipher link(href is attribute) in anchor tag  we use list interface
		     
		       List<WebElement> allTextInKink= driver.findElements(By.xpath("//a"));
		       
		     for(WebElement elm:allTextInKink) 
		     {
		    	 
		    	 System.out.println(elm.getAttribute("href"));// this will give all the attribute of 
                                                             // all link getAttribute it gives attribute
		     }

	}

}
