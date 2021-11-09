package webdriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificWindowBasedOnTitle {

	public static void main(String[] args) {
		String expectedTitle ="cognizant";
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		
		Set<String>  windowIds = driver.getWindowHandles();
		for(String winID:windowIds)
		{
			driver.switchTo().window(winID);
			String actualTitle = driver.getTitle();
			if(expectedTitle.equals(actualTitle))
			{
				driver.close();
			}
		}	

	}

}
