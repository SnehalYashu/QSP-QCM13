package TestNGsProgram;

import org.openqa.grid.internal.listeners.Prioritizer;
import org.testng.annotations.Test;

public class Testcase6 {
	@Test(priority = 1)
	public void a1()
	{
		System.out.println("hi");
	}
	@Test(priority = 2)
	public void a2()
	{
		System.out.println("good morning");
	}
	@Test(priority = 3)
	public void a3()
	{
		System.out.println("Bye");
	}

}
