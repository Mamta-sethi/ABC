package testng_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority_keyword {
@Test(priority = 2)
public void tc1() {
	Reporter.log("gm",true);
}
@Test(priority = 3)
public void tc2() {
	Reporter.log("ga",true);
}
@Test(priority = 1,enabled = false)
public void tc3() {
	Reporter.log("gn",true);
}}
