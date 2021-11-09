package PomClassesprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VitLoginPage {
	public VitLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	
	}
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(name="password")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement signInButton;
	
	
	//using business logic
		public void signIn(String username, String password) {
			usernameTextfield.clear();
			usernameTextfield.sendKeys(username);
			passwordTextfield.clear();
			passwordTextfield.sendKeys(password);
			signInButton.click();
			
			
		}
		

}
