package testng_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class multiple_annotation {
@Test
public void tc() {
	Reporter.log("hy",true);
}
@Test
public void tc1() {
	Reporter.log("hello",true);}

@Test
public void tc2() {
	Reporter.log("bye",true);
}



}
