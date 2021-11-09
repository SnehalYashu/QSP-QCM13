package PomClassesprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilsTestcase {

	public static void main(String[] args) throws Throwable {
		String filepath="./Resources/vit.properties";
		PropertyUtils proputil=new PropertyUtils();
		String URL = proputil.getPropertyData(filepath, "URL");
		String username = proputil.getPropertyData(filepath, "username");
		String password = proputil.getPropertyData(filepath, "password");
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.getLoginButton();
		

	}

}
