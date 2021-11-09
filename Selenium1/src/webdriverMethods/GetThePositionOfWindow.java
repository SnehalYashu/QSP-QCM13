package webdriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetThePositionOfWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		Point point = driver.manage().window().getPosition();
	    int startX = point.getX();
	    int starty = point.getY();
	    System.out.println(startX);
	    System.out.println(starty);
	}

}
