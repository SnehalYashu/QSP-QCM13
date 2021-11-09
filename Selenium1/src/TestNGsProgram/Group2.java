package TestNGsProgram;

import org.testng.annotations.Test;

public class Group2 {
	@Test(groups= {"regressionTestCase"})
	public void sample3()
	{
		System.out.println("this is regession testcase2");
	}
    @Test(groups= {"smokeTestCase"})
    public void sample4()
    {
    	System.out.println("this is smoke testcase2");
    }
}
