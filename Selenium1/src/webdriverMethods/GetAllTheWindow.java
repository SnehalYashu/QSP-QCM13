package webdriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllTheWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nukari.com");
		Set<String> windowIds = driver.getWindowHandles();
		for(String ids:windowIds)
		{
			System.out.println(ids);
		}
		driver.close();

	}

}
