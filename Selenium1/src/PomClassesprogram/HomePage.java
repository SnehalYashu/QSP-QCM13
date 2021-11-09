package PomClassesprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="username")
	private WebElement usernameTexefield;
	
	@FindBy(name="pwd")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginButton;
	
	@FindBy(id="container_tasks")
	private WebElement Tasks;
	
	@FindBy(id="container_users")
	private WebElement users;
	
	@FindBy(id="logoutLink")
	private WebElement logout;

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

	

	public WebElement getTasks() {
		return Tasks;
	}

	public void setTasks(WebElement tasks) {
		Tasks = tasks;
	}

	public WebElement getUsers() {
		return users;
	}

	public void setUsers(WebElement users) {
		this.users = users;
	}

	public WebElement getLogout() {
		return logout;
	}

	public void setLogout(WebElement logout) {
		this.logout = logout;
	}
}
