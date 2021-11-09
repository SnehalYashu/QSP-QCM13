package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAlert {

	public static void main(String[] args) {
		String expectedTitle="Life Insurance Corporation of India";
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://licindia.in/");
		
		driver.findElement(By.xpath("//b[text()='Online Loan']")).click();
		driver.findElement(By.xpath("//b[text()='Pay Direct (Without login)']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.get("https://ebiz.licindia.in/D2CPM/?_ga=2.21991356.660631486.1634793590-388142133.1634793590#Login");
		String actualtitle= driver.getTitle();
		System.out.println(actualtitle);
		if(expectedTitle.equals(actualtitle))
		{
			System.out.println("title is verified");
		}
		else
		{
			System.out.println("title verified is failed");
		}
		driver.quit();
		

	}

}
