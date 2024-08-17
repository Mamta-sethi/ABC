package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class hidden_divpopup {	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.in/");
		driver.manage().window().maximize();
		//click on cancel botton of hidden div popup
		driver.findElement(By.xpath("//span[@role='button']")).click();
	
	
	
	
	
	
	
	
	
}}
