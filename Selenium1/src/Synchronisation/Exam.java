package Synchronisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exam {

	public static void main(String[] args) {
		String expectedTitle="actiTIME - Login";
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String actualtitle=driver.getTitle();
		driver.manage().window().maximize();
		driver.findElement(By.id("headerContainer")).getText();
		System.out.println(actualtitle);
		if(expectedTitle.equals(actualtitle))
		{
			System.out.println("verify the test");
		}
		else
		{
			System.out.println("verify is failed");
		}
		

	}

}
