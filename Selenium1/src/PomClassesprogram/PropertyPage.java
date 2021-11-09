package PomClassesprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyPage {
	public PropertyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement usernameTexefield;
	
	@FindBy(name="pwd")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginButton;

	public WebElement getUsernameTexefield() {
		return usernameTexefield;
	}

	public void setUsernameTexefield(WebElement usernameTexefield) {
		this.usernameTexefield = usernameTexefield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public void setPasswordTextfield(WebElement passwordTextfield) {
		this.passwordTextfield = passwordTextfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	

	
	
	

}
