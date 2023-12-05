package testautomationpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Utility {
	
	
	
	public static WebDriver getDriver() {
		// yeh method webdriver ko initialize karake uska instance return karega
		WebDriver driver = new ChromeDriver();
		return driver;

	}
	public static String getProperty(String key) {
		
		File file=new File("src/test/resources/data.properties");
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Properties properties=new Properties();
		try {
			properties.load(fileInputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties.getProperty(key);
		
	}
	
public static void getscreenShot(WebDriver driver, String name) {
		
		TakesScreenshot  takesscreeShot=(TakesScreenshot)driver;
		   File file=	takesscreeShot.getScreenshotAs(OutputType.FILE);
		   try {
			FileUtils.copyFile(file, new File("src/test/resources/screenshotimage/"  + name +".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
