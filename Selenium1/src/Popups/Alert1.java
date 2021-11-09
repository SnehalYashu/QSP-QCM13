package Popups;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.marimallappawomenscollege.org/");
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='chromestyle']/ul/li"));
		System.out.println(list.size());
		for(WebElement e:list)
		{
			System.out.println(e.getText());
		}
		System.out.println("******************************************************");
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		driver.findElement(By.xpath("//input[@name='Send']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		System.out.println("successfully popup");
		driver.quit();

	}

}
