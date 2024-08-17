package wd_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class scenario {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.flipkart.com");
	String tit = driver.getTitle();
	System.out.println(tit);
	String getpage_source = driver.getPageSource();
	System.out.println(getpage_source);

	
	
}}

