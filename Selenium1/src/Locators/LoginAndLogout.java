package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndLogout {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String expectedTitle="actiTIME - Enter Time-Track";
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(5000);
	    String actualTitle=driver.getTitle();
		System.out.println("actual Title is:"+actualTitle);
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("testcase is passed");
		}
		else
		{
			System.out.println("testcase is failed");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Logout']")).click(); 

	}

}
