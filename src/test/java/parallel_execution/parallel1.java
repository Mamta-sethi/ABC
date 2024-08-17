package parallel_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel1 {
@Test
public void tc1() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
}
}
