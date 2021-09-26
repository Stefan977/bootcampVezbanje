package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IMDB_LogIn {

	public WebDriver driver;
	public WebElement logIn;
	public WebElement logInImdb;
	public IMDB_LogIn(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getLogIn() {
		return driver.findElement(By.id("signin-options"));
	}
	public WebElement getLogInImdb() {
		return driver.findElement(By.className("auth-provider-text"));
		
		
	}
	
}
