package batch_execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample3 {
	@Test
	public void tc7() {
		Reporter.log("running tc 7",true);
	}
	@Test
	public void tc8() {
		Reporter.log("running tc 8",true);
	}
	@Test
	public void tc9() {
		Reporter.log("running tc 9",true);
	}
}
