package extentreportingDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelectTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		WebElement birthDate=driver.findElement(By.name("DateOfBirthDay"));
		WebElement birthMonth=driver.findElement(By.name("DateOfBirthMonth"));
		WebElement birthYear=driver.findElement(By.name("DateOfBirthYear"));
		DropDownSelectTag.selectDropDownValue(birthDate, "28");
		DropDownSelectTag.selectDropDownValue(birthMonth, "August");
		DropDownSelectTag.selectDropDownValue(birthYear, "2000");
		
		
	}
	
	public static void selectDropDownValue(WebElement ele , String value) {
		Select dropDownSelect=new Select(ele);
	List<WebElement> allOptions=dropDownSelect.getOptions();
	for(WebElement option:allOptions) {
		if(option.getText().equals(value)) {
			option.click();
			break;
		}
	}
		
	}
	
	

}
