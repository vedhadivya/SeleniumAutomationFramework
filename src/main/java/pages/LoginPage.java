package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	private By usernameTextbox = By.name("username");
	private By passwordTextbox = By.name("password");
	private By loginButton = By.xpath(" //button[@type=\"submit\"]");

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	public void enterUsername(String username) {
		driver.findElement(usernameTextbox).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordTextbox).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
}


