package extentreportingDemo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testautomationpractice.Utility;



public class FlipkartExtentReport {
	
	public WebDriver driver;
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	@BeforeTest
	public void setExtent() {
		sparkReporter= new  ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/myReport.html");
		sparkReporter.config().setDocumentTitle("Automation Report");//Title of the report
		sparkReporter.config().setReportName("Functional Report");//report name
		sparkReporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Hostname", "LocalHost");
		extent.setSystemInfo("OS", "Window10");
		extent.setSystemInfo("Testers name", "Aparna");
		extent.setSystemInfo("Browser", "Chrome Browser");
		
	}
	@AfterTest
	public void endReport() {
		extent.flush();
	}
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void amazonTitleTest() {
		// we have make entry of new test by using  ExtentTest 
		
		test =extent.createTest("amazonTitleTest");//it will create new report in ur extent report
		
		String actualTitle=driver.getTitle();
		
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	
		assertEquals(actualTitle, expectedTitle);
		
	}
	@Test
	public void amazonLogoTest() {
		
		test =extent.createTest("amazonLogoTest");
		
	WebElement amazonLogo=	driver.findElement(By.xpath("//a//span[@id='logo-ext']"));
	System.out.println(amazonLogo.isDisplayed());
	assertTrue(amazonLogo.isDisplayed());
	}
	@Test
	public void amzonSearchText() {
		test =extent.createTest("amzonSearchText");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile");
	}
	
	public void tearDown(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL,"Test Case Failed Is" + result.getName());//to add name in extent report
			test.log(Status.FAIL, "Test Case Failed Is" + result.getThrowable());//to add error/exception in report}
			Utility.getscreenShot(driver, result.getName());
		
	}

}
}
