package PomClassesprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		LogiinnPage login = new LogiinnPage(driver);
		login.getCheckbox().click();
		Thread.sleep(3000);
		login.getForgetPassword().click();
		String text = login.getIdentifyYourselfText().getText();
		String text1 = login.getIdentifyLinkText().getText();
		String text2 = login.getIdentifyText().getText();
		String text3 = login.getCheckboxText().getText();
		System.out.println(text);
		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
		login.getUsernameTexefield().sendKeys("admin");
		login.getPasswordTextfield().sendKeys("manager");
		login.getLoginButton().click();
		

	}

}
