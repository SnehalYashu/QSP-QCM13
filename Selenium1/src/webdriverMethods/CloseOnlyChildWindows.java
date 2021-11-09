package webdriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyChildWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
	    String parentwindowID = driver.getWindowHandle();
		Set<String> allwindowids = driver.getWindowHandles();
		allwindowids.remove(parentwindowID);
		for(String winID:allwindowids)
		{
			driver.switchTo().window(winID);
			driver.close();
		}

	}

}
