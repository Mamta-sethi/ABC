package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com");
	//maximize
	driver.manage().window().maximize();
	//syntax of tagname
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	//password
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	//click on login btn
	driver.findElement(By.id("login-button")).click();
	//title given by dev
	String expT="Swag Labs";
	String actT=driver.getTitle();
	//varification
	if(expT.equals(actT)) {
	System.out.println("user is navigate to hp,Tc is pass");	
	}
	else {
		System.out.println("user is navigate to hp,Tc is failed");
	}	
	
}
}
