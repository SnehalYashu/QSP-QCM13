package PomClassesprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		HomePage home = new HomePage(driver);
		home.getUsernameTexefield().sendKeys("admin");
		home.getPasswordTextfield().sendKeys("manager");
		home.getLoginButton().click(); 
		Thread.sleep(2000);
		home.getTasks().click();
		Thread.sleep(2000);
		home.getUsers().click();
		Thread.sleep(2000);
		home.getLogout().click();
	}

}
