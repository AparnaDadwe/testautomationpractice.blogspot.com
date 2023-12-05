package testautomationpractice.blogspot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebElemntInsideIframe {

	public static void main(String[] args) {
		 WebDriver driver=    new ChromeDriver();
		 
		 driver.get("https://testautomationpractice.blogspot.com/");
		 
		 driver.manage().window().maximize();
		 
		 //a[@href='https://www.formsite.com/?utm_source=footer']" this webelent inside the 
		 //iframe tag that why its not click to another page so we have to first switch to
		 //iframe tag
		   WebElement iframeElement= driver.findElement(By.xpath("//iframe[@id='frame-one1434677811']"));
		      driver.switchTo().frame(iframeElement);
		 
		System.out.println( driver.findElement
		 (By.xpath("//a[@href='https://www.formsite.com/form_app/FormSite?EParam"
		 		+ "=Dwsnv4qzZPqB66fs8gZt46LUUzh9HC4IG6dvSNxFOr9vqw1zPne"
		 		+ "7MsbXoygwKNSPfR7VNq6KpIDG16MoMCjUj81WK9Tyr3G4DAsnrKuN1uw"
		 		+ "x3CA_haJpwH0VKqtjIwUJa3RsNGLkM8jCoHTLgQvkXWmzUQc9SKQ6iNSxpJuoeoQO5gSStjyqUw']")).getText());
  
//		WebElement inputText= driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']"));
//		inputText.sendKeys("Aparna Warotkar");
		
		//switch to another field 
		 driver.switchTo().defaultContent();
		WebElement inputText= driver.findElement(By.xpath("//input[@id='field2']"));
		inputText.sendKeys("Aparna Warotkar");
	
		         
//          driver.switchTo().defaultContent();
//  WebElement fieldText=driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
//    fieldText.sendKeys("Hello blogspot ");
//    System.out.println(driver.getTitle());
	
	}

}
