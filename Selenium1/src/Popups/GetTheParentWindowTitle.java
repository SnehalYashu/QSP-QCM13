package Popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheParentWindowTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		String parentwindowid = driver.getWindowHandle();
		Set<String> allwindowids = driver.getWindowHandles();
		allwindowids.remove(parentwindowid);
		for(String winID:allwindowids)
		  {
		  driver.switchTo().window(winID);
		  driver.close();
		  } 
		  driver.switchTo().window(parentwindowid);
	      Thread.sleep(2000);
		  JavascriptExecutor js=(JavascriptExecutor)driver;;
		  String pageTitle = js.executeScript("return document.title").toString();
		  System.out.println(pageTitle);
		  driver.quit();

	}

}
