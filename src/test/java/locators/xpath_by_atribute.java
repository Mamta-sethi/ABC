package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpath_by_atribute {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.saucedemo.com");
	//un
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	//pwd
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	//login
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	//verification
	String expT="Swag Labs";
	String aclT=driver.getTitle();
	if(expT.equals(aclT)) {
		System.out.println("Tc is pass,user navigate to hp");
		}
	else {
		System.out.println("Tc is failed,user navigate to hp");
	}
}
}
