package TestNGsProgram;

import org.testng.annotations.Test;

public class TestCase7 {
	@Test(priority = 1)
	public void a1()
	{
		System.out.println("hi");
	}
	@Test(priority = 1)
	public void a2()
	{
		System.out.println("good morning");
	}
	@Test(priority = 1)
	public void a3()
	{
		System.out.println("Bye");
	}
}
