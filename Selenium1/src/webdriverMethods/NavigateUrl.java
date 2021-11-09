package webdriverMethods;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateUrl {

	public static void main(String[] args) throws MalformedURLException  {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			URL url = new URL("https://flipkart.com");
			  driver.navigate().to(url);
			  driver.quit();

	}

}
