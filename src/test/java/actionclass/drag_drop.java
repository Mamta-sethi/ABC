package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	//srsele
	WebElement srsele = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
	//desele
	WebElement desele = driver.findElement(By.xpath("//ol[@id='amt7']"));
	//create objet of actions class
	Actions a=new Actions(driver);
	a.dragAndDrop(srsele, desele).perform();
	
	
	
	
}
}
