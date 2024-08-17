package parallel_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel2 {
@Test
public void tc2() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
}
}
