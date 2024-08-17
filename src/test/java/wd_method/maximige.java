package wd_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class maximige {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	driver.manage().window().minimize();
}

}
