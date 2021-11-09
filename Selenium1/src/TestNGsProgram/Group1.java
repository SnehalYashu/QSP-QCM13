package TestNGsProgram;

import org.testng.annotations.Test;

public class Group1 {
	@Test(groups= {"smokeTestCase"})
	public void sample()
	{
		System.out.println("this is smoketestcasee 1");
	
	}
	@Test(groups= {"regressionTestCase"})
	public void sample1()
	{
		System.out.println("this is regression testing");
	}

}
