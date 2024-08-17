package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class linkbox2 {
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//handle and store r.v
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		//creat new account
		Select s=new Select(day);
		s.selectByVisibleText("5");
		
		//for month
		WebElement month = driver.findElement(By.xpath("//select[@id='month']")); 
		Select a=new Select(month);
		a.selectByVisibleText("May");
		//year
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select b=new Select(year);
		b.selectByVisibleText("1999");
		//categori
		 driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
}}
