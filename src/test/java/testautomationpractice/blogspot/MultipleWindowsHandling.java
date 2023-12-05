package testautomationpractice.blogspot;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandling {

	public static void main(String[] args) {
		
		WebDriver driver=   new ChromeDriver();
	    
	    driver.get("https://testautomationpractice.blogspot.com/");
	    
	    driver.manage().window().maximize();	    
	    WebElement searchTextField=driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
	    searchTextField.sendKeys("Testautomationpractice Searched");
	    
	    driver.findElement(By.xpath("//a[@href='https://www.blogger.com']")).click();
	    
	    // to know the our control in on which window so we use getTitle method
	    
	    System.out.println(driver.getTitle());
	    
	    searchTextField.clear();// clear method will clear text in search box
	    
	  //we have to switch one window , tab ,page to other window because our current control 
	    //on parent window we have to explicitely switch to another wndoe to open next link on
	    //another tab
	    
	    //handling multiple tab
	    
	    String parentWindowHandle=driver.getWindowHandle();//getWindowHandle return current/parent
	                                                      //window ka handle
	    
	    Set<String> allWindowsHandle=driver.getWindowHandles();
	    
	  //window(parentWindowHandle) ethe aplyala as handle pathvav lagel jo parenwindowhandle shi
	    //equal nahi asla pahije tyasathi for each loop use krun if else condition vapaeavi
	    
	    for(String aWHandle:allWindowsHandle) {
	    	
	    	if(!(aWHandle.equals(parentWindowHandle)))// if   aWHandle is not equal to  parentWindowHandle
	    	{                                        //then switch and execute if block
	    		driver.switchTo().window(aWHandle);	// window(aWHandle) this is handle of second window
	    	}
	    }
	  
	    // link pain hamesha ham click method use karte hai
	    driver.findElement(By.xpath("//a[text()='Create your blog']")).click();
	   
	    // now we have to back to switch to main means paren window then and perform some action 
	    
	  //ya pai hame stale element reference exception ata hai because hamara control respective
	    //tab se hamne another tab pain de diya and withou switching to main/parent window 
	    //we are trying to intercat to webelemnt of parent window so we have to switch again to parent window
	    
	    driver.switchTo().window(parentWindowHandle);
	    
	    searchTextField.sendKeys("Back To Search Box");// sendKeys("Back To Search Box") phir se
	                                                 // parent window pain send karte hai toh
	    
	    
	    
	}

}
