package testautomationpractice.blogspot;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TargetSearchLink {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.target.com/");
	}
	@Test
    public void getAllLinkSearchBox() {
    	driver.findElement(By.xpath("//input[@id='search']")).click();
    	  List<WebElement>   searchList=     driver.findElements(By.xpath("//ul//li[@class='styles__LiWithBorder-sc-1j0iz5j-0 kAPCPA']"));
    	  System.out.println("Suggestion in seasrchbox"+ searchList.size());
    	  for(WebElement list:searchList) {
    		  System.out.println(list.getText() + list.getAttribute("href"));
    	  }
    	  
//    	  Iterator<WebElement> itrList=searchList.iterator();
//    	 while(itrList.hasNext()) {
//    		 WebElement elm=itrList.next();
//    		 System.out.println(elm.getText());
//    	 }
	}
}
