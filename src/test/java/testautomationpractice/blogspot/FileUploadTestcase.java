package testautomationpractice.blogspot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTestcase {

	public static void main(String[] args) {

		WebDriver driver=	new ChromeDriver();
		
	     driver.get("https://testautomationpractice.blogspot.com/");
	     
	     driver.manage().window().maximize();
	     WebElement iframeElement= driver.findElement(By.xpath("//iframe[@id='frame-one1434677811']"));
	      driver.switchTo().frame(iframeElement);
	 
	System.out.println( driver.findElement
	 (By.xpath("//a[@href='https://www.formsite.com/form_app/FormSite?EParam"
	 		+ "=Dwsnv4qzZPqB66fs8gZt46LUUzh9HC4IG6dvSNxFOr9vqw1zPne"
	 		+ "7MsbXoygwKNSPfR7VNq6KpIDG16MoMCjUj81WK9Tyr3G4DAsnrKuN1uw"
	 		+ "x3CA_haJpwH0VKqtjIwUJa3RsNGLkM8jCoHTLgQvkXWmzUQc9SKQ6iNSxpJuoeoQO5gSStjyqUw']")).getText());
	     
	 driver.switchTo().defaultContent();
	
	WebElement fileUploadBtn=driver.findElement(By.xpath("//input[@id='RESULT_FileUpload-10']"));
 
 fileUploadBtn.sendKeys("D:\\Eclipse Workspace\\testautomationpractice.blogspot.com\\src\\test\\resources\\screenshots\\testimage.png");
	     

	}

}
