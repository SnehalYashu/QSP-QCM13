package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedAndIsDisplayedMethod {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement checkbox = driver.findElement(By.name("remember"));
		checkbox.click();
		Thread.sleep(2000);
		boolean flag = checkbox.isDisplayed();
		boolean flag2 = checkbox.isSelected();
		if(flag && flag2)
		{
			System.out.println("element is displayed and checked,testcase is passed");
		}
		else
		{
			System.out.println("element is not displayed");
		}
		driver.quit();
		

	}

}
