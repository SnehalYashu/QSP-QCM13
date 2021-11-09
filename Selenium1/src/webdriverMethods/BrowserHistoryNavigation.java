package webdriverMethods;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserHistoryNavigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://flipcart.com");
		Navigation navigation = driver.navigate();
		
		navigation.back();
		navigation.forward();
		navigation.refresh();
		driver.quit();
		

	}

}
