package vtiger;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class create_cls {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("http://localhost:8888/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//login to aap
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("root");
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	//verify user is navigate to home page
	String expT="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
	String actT=driver.getTitle();
	if(expT.equals(actT)) {
		System.out.println("tc is pass");
	}
	else {
		System.out.println("tc is fail");
	
}
	//click on contact module
	driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	driver.findElement(By.xpath("")).sendKeys("");
}
}

