package screenshot;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class individual {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	//store element in r variable
	WebElement logo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	//take the screshort
	File src = logo.getScreenshotAs(OutputType.FILE);
	
	File dest=new File("C:\\Users\\Mamta\\OneDrive\\Desktop\\logoofgoogle.page.png");
	Files.copy(src, dest);
	
	
	
	
}
}
