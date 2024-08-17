package com.swaglabs.objectrepostory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	//declaration
		@FindBy(xpath="//input[@id='user-name]")private WebElement un;
		@FindBy(xpath="//input[@id='password']")private WebElement pwd;
		@FindBy(xpath="//input[@id='login-button']")private WebElement loginbtn;
		
		//initialisation
		public void loginpage(WebDriver driver) {
			PageFactory.initElements( driver,this);
		}
		//getters

		public WebElement getUn() {
			return un;
		}

		public WebElement getPwd() {
			return pwd;
		}

		public WebElement getLoginbtn(){
			return loginbtn;
		}
		
	//blc
		public void logintoapp() {
			un.sendKeys("standard_user");
			pwd.sendKeys("secret_sauce");
			loginbtn.click();
		}
		
		
	
}
