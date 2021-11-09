package TestNGsProgram;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertCase {
	@Test
	public void soft()
	{
		String expectedTitle="qspiders";
		String actualTitle="qspide";
		
		
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
