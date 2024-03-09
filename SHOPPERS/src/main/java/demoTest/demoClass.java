package demoTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class demoClass extends BaseClass{
	@Test
	public void loginTest1()
	{				
		//Assert.fail();
		Reporter.log("login is executing", true);
	}
}
