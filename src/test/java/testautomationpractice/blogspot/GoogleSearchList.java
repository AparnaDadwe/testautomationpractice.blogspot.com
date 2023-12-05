package testautomationpractice.blogspot;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             WebDriver driver=new ChromeDriver();
             driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
             driver.get("https://www.google.com/");
             driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Java");
          List<WebElement> searchList=   driver.findElements(By.xpath("//ul//li[@class='sbct']"));
	          System.out.println("Suggestion of Search list size is :" + searchList.size());
	          for(WebElement list:searchList) {
	    		  System.out.println(list.getText());
	    	  }
	}

}
