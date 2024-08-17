package wd_method;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class scenario2 {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	driver.manage().window().minimize();
	//set position
	Point p=new Point(100, 200);
	driver.manage().window().setPosition(p);
	driver.close();
	
	
}
}
