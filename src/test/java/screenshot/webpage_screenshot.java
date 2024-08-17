package screenshot;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class webpage_screenshot {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	//typecast
	TakesScreenshot ts=(TakesScreenshot)driver;
	//call getscreenshort method
	File src = ts.getScreenshotAs(OutputType.FILE);
	//create object of file class
	File dest=new File("C:\\Users\\Mamta\\OneDrive\\Desktop\\FBpage.png");
	
	Files.copy(src, dest);
	
	
	
	
}
}
