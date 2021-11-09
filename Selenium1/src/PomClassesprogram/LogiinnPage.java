package PomClassesprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogiinnPage {
	public LogiinnPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="username")
	private WebElement usernameTexefield;
	
	@FindBy(name="pwd")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginButton;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement checkbox;
	
	@FindBy(linkText="Forgot your password?")
	private WebElement  forgetPassword;
	
	@FindBy(id="headerContainer")
	private WebElement  identifyYourselfText;
	
	@FindBy(xpath="//nobr[text()='actiTIME 2020 Online']")
	private WebElement  identifyText;
	
	@FindBy(linkText="actiTIME Inc.")
	private WebElement IdentifyLinkText;
	
	@FindBy(id="keepLoggedInLabel")
	private WebElement checkboxText;

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

	public WebElement getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(WebElement checkbox) {
		this.checkbox = checkbox;
	}

	public WebElement getForgetPassword() {
		return forgetPassword;
	}

	public void setForgetPassword(WebElement forgetPassword) {
		this.forgetPassword = forgetPassword;
	}

	public WebElement getIdentifyYourselfText() {
		return identifyYourselfText;
	}

	public void setIdentifyYourselfText(WebElement identifyYourselfText) {
		this.identifyYourselfText = identifyYourselfText;
	}

	public WebElement getIdentifyText() {
		return identifyText;
	}

	public void setIdentifyText(WebElement identifyText) {
		this.identifyText = identifyText;
	}

	public WebElement getIdentifyLinkText() {
		return IdentifyLinkText;
	}

	public void setIdentifyLinkText(WebElement identifyLinkText) {
		IdentifyLinkText = identifyLinkText;
	}

	public WebElement getCheckboxText() {
		return checkboxText;
	}

	public void setCheckboxText(WebElement checkboxText) {
		this.checkboxText = checkboxText;
	}
	
	
	
	
	

}
