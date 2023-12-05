package testautomationpractice.blogspot;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssignmentOfFlipkart {
	
	@Test
	public void TestFlipkartSearch() {
		
		
		String s_search_string = "Tv";
		String url = "https://www.flipkart.com";
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(url);
		
		
		//Checking page is navigated with the expected title
		String actual = driver.getTitle();
		String expected = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		assertEquals(actual, expected);
		
		 
//		//Clicking on Cross button
//		WebElement sign_in_cross = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
//		sign_in_cross.click();
		
		
		//Check Search Box is Displayed
		WebElement searchbx = driver.findElement(By.xpath("//input[@name ='q' and @type='text']"));
		assertEquals(searchbx.isDisplayed(), true);
		
		
		//Enter TV in Search text box
		searchbx.sendKeys(s_search_string);
		
		//Fetch All the Products Text
		List<WebElement> list_of_products = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
//		List<WebElement> list_of_products_price = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
		
//		//Clicked on Search button
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Check if search Results is displayed-VALIDATION 1
//		WebElement txtbx_search_result_text = driver.findElement(By.xpath("//span[contains(text(),'Showing 1 – 24 of 1,464 results for ')]"));
//		assertEquals(txtbx_search_result_text.isDisplayed(), true);
//		System.out.print(txtbx_search_result_text.isDisplayed());
//		
//		//Check if search Results is displayed-VALIDATION 2
//		String exp_search_title = s_search_string;
//		String actual_search_title = driver.getTitle();
//		if(actual_search_title.toLowerCase().contains(exp_search_title.toLowerCase())) {
//			assertTrue(true);
//		}else {
//			assertTrue(false);
//		}
//		
//		//Fetch All the Products Text
//		List<WebElement> list_of_products = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
//		List<WebElement> list_of_products_price = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
//		
		//Use of HashMaop to store Products and Their prices(after conversion to Integer)
//		String product_name;
//		String product_price;
//		int int_product_price;
//		HashMap<Integer, String> map_final_products = new HashMap<Integer,String>();
//		for(int i=0;i<list_of_products.size();i++) {
//			product_name = list_of_products.get(i).getText();//Iterate and fetch product name
//			product_price = list_of_products_price.get(i).getText();//Iterate and fetch product price
//			product_price = product_price.replaceAll("[^0-9]", "");//Replace anything wil space other than numbers
//			int_product_price = Integer.parseInt(product_price);//Convert to Integer
//			map_final_products.put(int_product_price,product_name);//Add product and price in HashMap
//		}
		
		
	}

}


