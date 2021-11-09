package PomClassesprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyLogicPage {
	public PropertyLogicPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement usernameTexefield;
	
	@FindBy(name="pwd")
	private WebElement passwordTextfield;
	 
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginButton;
	//using business logic
	public void login(String username,String password)
	{
		usernameTexefield.sendKeys(username);
		passwordTextfield.sendKeys(password);
		loginButton.click();
	}
	
	
		
	
}
