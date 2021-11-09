package webdriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllWindowTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		
		Set<String>  windowIds = driver.getWindowHandles();
		for(String winID:windowIds)
		{
			driver.switchTo().window(winID);
			System.out.println(driver.getTitle());
		}
		driver.quit();

	}

}
