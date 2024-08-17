package assert_verify;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assert_notequal {
@Test
public void tc2() {
	Reporter.log("tc run",true);
	String s1="hlo";
	String s2 ="hy";
	Assert.assertNotEquals(s1,s2);
	
}
}
