package wd_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class scenario4 {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.myntra.com");
	driver.get("https://www.facebook.com");
	//go back myntra
	driver.navigate().back();
	driver.manage().window().maximize();
	//come to fb
	driver.navigate().back();
	//title
	
}
}
