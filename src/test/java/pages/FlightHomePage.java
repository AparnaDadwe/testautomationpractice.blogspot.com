package pages;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightHomePage {
	
	WebDriver driver;
	WebElement pageTitle;
	WebElement buttonSelectCountry;
	WebElement buttonSelectLanguage;
	
	public FlightHomePage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getButtonSelectCountry() {
		setButtonSelectCountry();
		return buttonSelectCountry;
	}

	public void setButtonSelectCountry() {
this.buttonSelectCountry = driver.findElement(By.xpath("//button[@id='select-country-dropdown']"));
	}
	
	public WebElement getPageTitle() {
		setPageTitle();
		return pageTitle;
	}

	public void setPageTitle() {
		this.pageTitle =driver.findElement(By.xpath("//title[text()='Book Flights & Check In Online | Vistara']"));
	}

	public WebElement getButtonSelectLanguage() {
		setButtonSelectLanguage();
		return buttonSelectLanguage;
	}

	public void setButtonSelectLanguage() {
		this.buttonSelectLanguage = driver.findElement(By.xpath("//button[@class='dropdown-toggle modal-dropdown-style']"));
	}

	public void selectCountry(String countryName) {
		getButtonSelectCountry().click();
List<WebElement>countries=driver.findElements(By.xpath("//div[@id='modal-list-country']//ul//li//span"));
		
		for(WebElement country:countries) {
			
			if(country.getText().equalsIgnoreCase(countryName)) {
				
				country.click();
			}
		}
	}
	public List<String> getDropDownList() {
		getButtonSelectCountry().click();
		ArrayList<String> countryArray=new ArrayList<String>();
		List<WebElement>countriesName= driver.findElements(By.xpath("//div[@id='modal-list-country']//ul//li//span"));
		for(WebElement elm:countriesName) {
	    	//table ke andar complete list add karega vo list chahiye to return karo List
			countryArray.add(elm.getText());// ek ek element ka text dega lekin table ke element add kro
	    }
		return countryArray;
		
	}
	
	

}
