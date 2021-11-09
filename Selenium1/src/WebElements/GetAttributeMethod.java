package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) {
		String expectedTooltipTitle="Do not select if this computer is shared";
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		String actualtoolTipTitle = driver.findElement(By.name("remember")).getAttribute("title");
		System.out.println(actualtoolTipTitle);
		if(expectedTooltipTitle.equals(actualtoolTipTitle))
		{
			System.out.println("passed: Tool tip is verified");
		}
		else
		{
			System.out.println("failed: values are different");
		}
		//driver.quit();

	}

}
