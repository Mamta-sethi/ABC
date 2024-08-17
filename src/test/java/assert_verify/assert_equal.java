package assert_verify;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_equal {
@Test
public void verification() {
	String s1="mamta";
	String s2="mamta";
	Assert.assertEquals(s1,s2);
}
}
