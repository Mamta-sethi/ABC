package explicit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class exwait {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com");
	//un by locator technique
	By un=By.id("user-name");
	//pwd
	By pwd=By.id("password");
	//login
	By login = By.id("login-button");
	//syntax for explicit
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.presenceOfElementLocated(un)).sendKeys("stadard_user");
	
	
	
	
}
}
