package TestNGsProgram;

import org.testng.annotations.Test;
//creating dependency between test cases
public class TestCase12 {
	@Test
	public void login()
	{
		System.out.println("hi");
		throw new ArithmeticException();
		
	
	}
	@Test(dependsOnMethods = "login")
	public void cart()
	{
		System.out.println("hello");
		
	}
	@Test(dependsOnMethods = "cart")
   public void logout()
  {
	System.out.println("logout");
  }
}
