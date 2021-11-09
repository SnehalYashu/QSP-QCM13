package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysForKeyboardAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement userNameTextField = driver.findElement(By.id("username"));
		userNameTextField.sendKeys(Keys.CONTROL+"a");
		//userNameTextField.sendKeys(Keys.CONTROL+"c");
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.sendKeys(Keys.CONTROL+"v");
	}

}
