package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.swaglabs.objectrepostory.Loginpage;

public class swag_labs {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com");
	//login page app
	Loginpage lp= new Loginpage();
	lp.logintoapp();
	
}
}
