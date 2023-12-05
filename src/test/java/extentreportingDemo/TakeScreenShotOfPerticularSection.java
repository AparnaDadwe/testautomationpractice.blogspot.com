package extentreportingDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotOfPerticularSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		WebElement pageSection=driver.findElement(By.xpath("//div[@class='page-body']"));
		
		
		File srcFile=pageSection.getScreenshotAs(OutputType.FILE);
		
		File targetFile=new File("src/test/resources/screenshotimage/noEcommerceFeatureProduct.png");
		
		try {
			FileUtils.copyFile(srcFile, targetFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
				
	
	}

}
