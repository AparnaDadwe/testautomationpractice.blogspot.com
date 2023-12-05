package extentreportingDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotOfWholeAPge {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
	File sourceFile=ts.getScreenshotAs(OutputType.FILE);
	
	File targetFile=new File("src/test/resources/screenshotimage/target.png");
	
	try {
		FileUtils.copyFile(sourceFile, targetFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.close();
			

	}

}
