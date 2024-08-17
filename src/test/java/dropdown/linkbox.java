package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkbox {
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	//write 1st name
	driver.findElement(By.name("firstname")).sendKeys("Mamta");
	
	//write surname
	driver.findElement(By.name("lastname")).sendKeys("Sethi");
	//write mobile number
	driver.findElement(By.name("number_gmail_")).sendKeys("7735429933");

	
	
	
	
	
	
	
	
}
}