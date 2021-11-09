package ScreenShot;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotWebpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		TakesScreenshot ts =(TakesScreenshot)driver;
		File tempFile= ts.getScreenshotAs(OutputType.FILE);
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		File destFile = new File("./screenshots/"+timestamp+"webpage.png");
		tempFile.renameTo(destFile);
		driver.quit();
	}

}
