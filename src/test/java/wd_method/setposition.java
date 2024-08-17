package wd_method;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class setposition {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.com");
	//creat object of piont class
	Point p=new Point(300,400);
	//use setposition
	driver.manage().window().setPosition(p);
}
}
