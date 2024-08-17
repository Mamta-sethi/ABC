package wd_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class get {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.com");
	//close method
	driver.close();
}}
