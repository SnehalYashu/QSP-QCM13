package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotLoginButton {

	public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().window().maximize();
			File tempFile = driver.findElement(By.xpath("//div[text()='Login ']")).getScreenshotAs(OutputType.FILE);
			String timestamp = LocalDateTime.now().toString().replace(":", "-");
			File destFile = new File("./screenshots/"+timestamp+"Login.png");
			FileUtils.copyFile(tempFile, destFile);
			driver.quit();

	}

}
