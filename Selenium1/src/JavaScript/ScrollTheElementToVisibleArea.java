package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTheElementToVisibleArea {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='GOT IT']")).click();
		 WebElement ceoJobsLink = driver.findElement(By.xpath("//a[text()=' CEO Jobs']"));
		 JavascriptExecutor js=( JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(false)",ceoJobsLink);
	}

}
