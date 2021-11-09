package PomClassesprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage login = new LoginPage(driver);
		login.getUsernameTexefield().sendKeys("admin");
		login.getPasswordTextfield().sendKeys("manager");
		login.getLoginButton().click(); 
		driver.quit();  

	}

}
