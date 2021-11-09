package Popups;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectTodaysDate {

	public static void main(String[] args) {
		LocalDateTime DateAndTime = LocalDateTime.now();
		int date = DateAndTime.getDayOfMonth();
		String month = DateAndTime.getMonth().name();
		String editedmonth = month.substring(0, 1).toUpperCase()+month.substring(1, 3).toLowerCase();
		int year= DateAndTime.getYear();
		String day= DateAndTime.getDayOfWeek().name();
		String editedDay= day.substring(0, 1).toUpperCase()+day.substring(1, 3).toLowerCase();
		
		String TodaysDate=editedDay+" "+editedmonth+" "+date+" "+year;
		System.out.println(TodaysDate);
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//div[@class = 'fsw_inputBox dates inactiveWidget ']")).click();
		driver.findElement(By.xpath("//div[@aria-label='"+TodaysDate+"']")).click();
		//driver.quit();

	}

}
