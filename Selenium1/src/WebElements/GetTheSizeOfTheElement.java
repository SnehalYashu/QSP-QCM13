package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheSizeOfTheElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Dimension dimensions = driver.findElement(By.id("username")).getSize();
		int heightOfUsernameTextField= dimensions.getHeight();
		int widthOfusernametextField= dimensions.getWidth();
		System.out.println(heightOfUsernameTextField);
		System.out.println(widthOfusernametextField);
	}

}
