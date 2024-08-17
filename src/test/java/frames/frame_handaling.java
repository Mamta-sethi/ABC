package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_handaling {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
	//switch the control
	driver.switchTo().frame("//input[@id='fname']");
	
	//remove fn
	driver.findElement(By.xpath(""));
	
	
	
	
	
	
}
}
