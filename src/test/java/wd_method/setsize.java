package wd_method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class setsize {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.flipkart.com");
	//set the position of browser
	Dimension d=new Dimension(100, 200);
	driver.manage().window().setSize(d);
}
}
