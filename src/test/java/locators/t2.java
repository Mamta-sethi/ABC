package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class t2 {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.saucedemo.com");
	//maximize
	driver.manage().window().maximize();
	//un
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	//pw
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	//login
	driver.findElement(By.id("login-button")).click();
	//title given by dev
	String expT="Swag Labs";
	String actT=driver.getTitle();
	//verification
	if(expT.equals(actT))
	{
		System.out.println("user navigate to hp,Tc is pass");
		
	}
	else {
		System.out.println("user navigate to hp,Tc is failed");
	}
	
	
	
	
	
}
}
