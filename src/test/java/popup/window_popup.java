package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_popup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//main window/parent window
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//fetch session id of parent window
	String pid = driver.getWindowHandle();
	System.out.println(pid);
	
	//child win
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	
	//sessoin id of child window
	Set<String> allid = driver.getWindowHandles();
	System.out.println(allid);
	
	//switch the control of sel from pid to child id
	for(String CID:allid) {

		if(!pid.equals(CID)) {
			driver.switchTo().window(CID);
			
			//enter mail adress on child window
			driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']")).sendKeys("text@mamta");
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
}
