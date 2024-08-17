package testng_practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class depenon_method {
@Test
public void login() {
	Reporter.log("login to app",true);
	Assert.fail();
}
@Test(dependsOnMethods = "login")
public void logout() {
	Reporter.log("login from app",true);
}}
