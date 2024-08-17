package testng_practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class annotation_flow {
@Test
public void tc() {
	Reporter.log("actual tc",true);
}
@BeforeSuite
public void bs() {
	Reporter.log("db connection",true);
}
@AfterSuite
public void af() {
	Reporter.log("db disconnection",true);
	
}
@BeforeClass
public void bc() {
	Reporter.log("open the browser",true);
}
@AfterClass
public void ac() {
	Reporter.log("close the browser",true);
}
@BeforeMethod
public void bm() {
	Reporter.log("open the application",true);
}
@AfterMethod
public void am() {
	Reporter.log("close the browser",true);
}

}










