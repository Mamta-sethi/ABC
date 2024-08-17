package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_popup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php ");
    //write constomer id
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
	//click on submit btn
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	//print the text present on alert
	String text = driver.switchTo().alert().getText();
	System.out.println(text);
	//click on ok btn
	driver.switchTo().alert().accept();


}
}
