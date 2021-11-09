package Methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class AscendingOrder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		Set<String> allwindowIds = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>();
		for(String winId:allwindowIds)
		{
			driver.switchTo().window(winId);
			list.add(driver.getTitle());
			
		}
		System.out.println(list);
		Collections.sort(list);
		for(String title:list)
		{
			System.out.println(title);
		}
		driver.quit();

	}

}
