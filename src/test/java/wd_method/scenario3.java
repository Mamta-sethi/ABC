package wd_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class scenario3 {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.flipkart.com");
	driver.get("https://www.amazon.com");
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().refresh();
	
	
	
}
}
