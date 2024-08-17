package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile under 20k");
	driver.findElement(By.xpath("//button[@type=submit]")).click();
}
}
