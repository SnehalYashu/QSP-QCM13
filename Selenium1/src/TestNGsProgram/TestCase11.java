package TestNGsProgram;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase11 {
@Test
public void login()
{
	System.out.println("test case");
	Reporter.log("its reporter class");
	Reporter.log("test case id:001", true);
	
}
}
