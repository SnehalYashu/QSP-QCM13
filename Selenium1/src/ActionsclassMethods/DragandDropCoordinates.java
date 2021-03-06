package ActionsclassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropCoordinates {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		//identify the frame and pass driver controller to frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		WebElement box = driver.findElement(By.id("draggable"));
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(box, 280, 40).perform();
		//pass the driver controller to parent frame
		driver.switchTo().defaultContent();
		String text = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
		System.out.println(text);
		driver.quit();
	}

}
