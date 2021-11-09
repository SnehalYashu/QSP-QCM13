package ActionsclassMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInMultipleWindow {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		List<WebElement> navBar = driver.findElements(By.xpath("//ul[@class='navbar-nav mr-4 mb-2 mb-lg-0 pl-4 pl-lg-2']/li"));
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL);
		for(WebElement ele:navBar)
		{
			actions.click(ele);
		}
		actions.keyUp(Keys.CONTROL);
		actions.perform();
		driver.quit();

	}

}
