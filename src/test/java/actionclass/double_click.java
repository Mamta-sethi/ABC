package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//select gmail
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		//creat objet of actions
		Actions a=new Actions(driver);
		//doubleclick123
		a.moveToElement(gmail).doubleClick().perform();
}
}
