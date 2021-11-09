package ScreenShot;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotOfWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		File tempFile = driver.findElement(By.xpath("//div[@class='bot_column']")).getScreenshotAs(OutputType.FILE);
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		File destFile = new File("./screenshots/"+timestamp+"Robot.png");
		tempFile.renameTo(destFile);
		driver.quit();

	}

}
