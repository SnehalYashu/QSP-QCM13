package webdriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildWindowApproach2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
	    String parentwindowID = driver.getWindowHandle();
		Set<String> allwindowids = driver.getWindowHandles();
		for(String winID:allwindowids)
		{
			driver.switchTo().window(parentwindowID);
			if(winID.equals(allwindowids))
			{
				driver.close();
			}
		}

	}

}
