package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToAnotherUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.flipkart.com");
		driver.quit();

	}

}
