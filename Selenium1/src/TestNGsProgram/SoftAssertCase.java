package TestNGsProgram;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertCase {
	@Test
	public void soft()
	{
		String expectedTitle="qspiders";
		String actualTitle="qspide";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualTitle, expectedTitle);
		soft.assertAll();
		
	}

}
