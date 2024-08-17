package assert_verify;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft {
@Test
public void verification() {
	String s1="hii";
	String s2="hlo";
	SoftAssert s=new SoftAssert();
	s.assertEquals(s1,s2);
	Reporter.log("hi,im after failling verification",true);
	s.assertAll();
}
}
