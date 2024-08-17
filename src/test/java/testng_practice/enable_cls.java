package testng_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enable_cls {
	@Test(enabled=false)
	public void tc1() {
		Reporter.log("mamta",true);
	}
	@Test(priority = 3)
	public void tc2() {
		Reporter.log("rita",true);
}}
