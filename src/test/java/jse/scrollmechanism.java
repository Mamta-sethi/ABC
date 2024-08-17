package jse;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollmechanism {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	//type cast
	JavascriptExecutor jse =(JavascriptExecutor)driver;
	//srolldown
	Thread.sleep(4000);
	jse.executeScript("window.scrollBy(0,2000);");
	//srollup
	Thread.sleep(4000);
	jse.executeScript("window.scrollBy(0,2000);");
	
	
	
	
	
}
}
