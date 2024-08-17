package batch_execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample1 {
@Test
public void tc1() {
	Reporter.log("running tc 1",true);
}
@Test
public void tc2() {
	Reporter.log("running tc 2",true);
}
@Test
public void tc3() {
	Reporter.log("running tc 3",true);
}
}
