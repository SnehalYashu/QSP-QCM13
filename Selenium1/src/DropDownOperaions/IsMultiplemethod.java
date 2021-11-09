package DropDownOperaions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiplemethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement dropDown = driver.findElement(By.xpath("//select"));
		Select select = new Select(dropDown);
		boolean flag = select.isMultiple();
		if(flag)
		{
			System.out.println("It is multiple dropdown");
		}
		else
		{
			System.out.println("It is single dropdown");
		}
		driver.quit();
	}

}
