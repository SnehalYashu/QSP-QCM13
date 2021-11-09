package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureCurrentWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		  String windowId = driver.getWindowHandle();
		  System.out.println(windowId);
		  driver.quit();
	}

}
