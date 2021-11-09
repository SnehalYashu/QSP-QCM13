package TestNGsProgram;

import org.testng.annotations.Test;

public class TestCase10 {
	@Test()
	public void a1()
	{
		System.out.println("hi");
	}
	@Test(invocationCount = 0)
	public void a2()
	{
		System.out.println("good morning");
	}
	@Test()
	public void a3()
	{
		System.out.println("Bye");
	}

}
