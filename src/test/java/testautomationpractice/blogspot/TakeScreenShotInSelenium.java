package testautomationpractice.blogspot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotInSelenium {

	public static void main(String[] args) throws IOException {
		WebDriver driver=	new ChromeDriver();
		
	     driver.get("https://testautomationpractice.blogspot.com/");
	     
	     driver.manage().window().maximize();
	     
	     
	     TakesScreenshot  takesscreeShot=(TakesScreenshot)driver;
	     File file=	takesscreeShot.getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(file, new File("src/test/resources/screenshots/testimage.png"));
	}

}
