package testautomationpractice.blogspot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBoxClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		

        //single checkbox
//        driver.findElement(By.xpath("//input[@id='monday']")).click();
List<WebElement> checkBoxFields=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
//        System.out.println("No of CheckBox is"+checkBoxFields.size());
        
        
        
        //multiple click check list
//        for(WebElement checkLi:checkBoxFields) {
//        	
//        	checkLi.click();
//        }
        
        //select multiple checkbox by choice i want monday and sunday
        
//  for(WebElement checkLi:checkBoxFields) {
//        	
//	      String checkBoxName=checkLi.getAttribute("id");
//	        if(checkBoxName.equals("monday") || checkBoxName.equals("sunday")) {
//	        	checkLi.click();
//	        	
//	        llllllllll}
//        	
//          }
        
        //I have a seven checkboxes and i want to select last two checkboxes then how will do
        
        //No of checkboxes - no of checkboxes want to select= starting index
        //7-2=5
        
      int totalNoOfCheckBoxes=checkBoxFields.size();
//        
       /*for(int i=totalNoOfCheckBoxes-2;i<totalNoOfCheckBoxes;i++) {
        	checkBoxFields.get(i).click();
        }*/
        
        
      //I have a seven checkboxes and i want to select first two checkboxes then how will do
       
       for(int i=0;i<totalNoOfCheckBoxes;i++) {
    	   if(i<3) {
    	   checkBoxFields.get(i).click();
       }
       }
        
	}

}
