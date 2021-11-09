package ActionsclassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		Thread.sleep(2000);
	    
	    WebElement homeLiving = driver.findElement(By.linkText("HOME & LIVING"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(homeLiving).perform();
	    driver.quit();
	}

}
