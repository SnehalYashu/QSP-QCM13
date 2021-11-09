package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeTheWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.quit();

	}

}
