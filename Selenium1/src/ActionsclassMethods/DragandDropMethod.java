package ActionsclassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropMethod {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source = driver.findElement(By.id("box3"));
		WebElement destination = driver.findElement(By.id("box103"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, destination).perform();
		
		WebElement source1 = driver.findElement(By.id("box1"));
		WebElement destination1 = driver.findElement(By.id("box101"));
		Actions actions1 = new Actions(driver);
		actions.dragAndDrop(source1, destination1).perform();
		
		WebElement source2 = driver.findElement(By.id("box2"));
		WebElement destination2 = driver.findElement(By.id("box102"));
		Actions actions2 = new Actions(driver);
		actions.dragAndDrop(source2, destination2).perform();
		driver.quit();
	}

}
