package testng_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class innovation_count {
@Test(invocationCount = 4)
public void tc1() {
	Reporter.log("abc",true);
	
}
}
