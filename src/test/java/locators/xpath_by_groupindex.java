package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpath_by_groupindex {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.saucedemo.com");
	//xpath for un
	driver.findElement(By.xpath("(//input)[1]")).sendKeys("standard_user");
	//xpath for pwd
	driver.findElement(By.xpath("(//input)[2]")).sendKeys("secret_sauce");
	//xpath for lgn
	driver.findElement(By.xpath("(//input)[3]")).click();
}
}
