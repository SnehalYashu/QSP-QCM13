package TestNGsProgram;

import org.testng.annotations.Test;

public class TestCase9 {
	@Test(enabled = false)
	public void a1()
	{
		System.out.println("hi");
	}
	@Test()
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
