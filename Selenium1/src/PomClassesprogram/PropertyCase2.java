package PomClassesprogram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyCase2 {

	public static void main(String[] args) throws Throwable {
		String filePath="./Resources/prop.properties";
		FileInputStream file = new FileInputStream(filePath);
		Properties property = new Properties();
		property.load(file);
		String URL = property.getProperty("URL");
		String username = property.getProperty("username");
		String password = property.getProperty("password");
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		  PropertyPage proper = new PropertyPage(driver);
		proper.getUsernameTexefield();
		proper.getPasswordTextfield();
		proper.getLoginButton();

	}

}
