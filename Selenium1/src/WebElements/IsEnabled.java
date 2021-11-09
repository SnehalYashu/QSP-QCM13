package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		boolean flag= driver.findElement(By.xpath("//input[@class='form-control']")).isEnabled();
		if(flag)
		{
			System.out.println("it is enabled");
		}
		else
		{
			System.out.println("It is disabled");
		}
		driver.quit();
	}

}
