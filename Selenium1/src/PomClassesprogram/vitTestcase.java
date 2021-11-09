package PomClassesprogram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vitTestcase {

	public static void main(String[] args) throws Throwable {
		String filePath="./Resources/vit.properties";
		FileInputStream file = new FileInputStream(filePath);
		Properties property = new Properties();
		property.load(file);
		String URL = property.getProperty("URL");
		String username = property.getProperty("username");
		String password = property.getProperty("password");
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(URL);
		 VitLoginPage loginpage = new VitLoginPage(driver);
		loginpage.signIn(username, password);
	

	}

}
