package webdriverMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWindowDescendingOrder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		
		Set<String> allwindowIds = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>();
		for(String winID:allwindowIds)
		{
			driver.switchTo().window(winID);
			list.add(driver.getTitle());
		}
		System.out.println(list);
		Collections.sort(list);
		Collections.reverse(list);
		for(String title:list)
		{
			System.out.println(title);
		}
		driver.quit();


	}

}
