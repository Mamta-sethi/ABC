package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class move_to_element {
public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	//store the element which we should have to handle
	WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
	//create object class of actions 
	Actions a= new Actions(driver);
	a.moveToElement(gmail).perform();
	
	
	
	
	
	
		
}
}