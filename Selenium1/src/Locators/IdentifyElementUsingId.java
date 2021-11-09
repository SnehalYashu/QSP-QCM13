package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyElementUsingId {

	public static void main(String[] args) {
		//browser executable setting
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		//launching the browser
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//navigate to skillrary webpage
		driver.get("https://www.skillrary.com");
		//identification of search bar and entering "java" string to it
		driver.findElement(By.name("q")).sendKeys("java");
		//driver.quit();
		

	}

}
