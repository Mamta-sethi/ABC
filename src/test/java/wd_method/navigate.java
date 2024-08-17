package wd_method;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class navigate {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.google.com");
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.com");
		//go back
		Thread.sleep(3000);
		driver.navigate().back();
		//go forward
		Thread.sleep(3000);
		driver.navigate().forward();
		//refresh
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.quit();
	}

}
