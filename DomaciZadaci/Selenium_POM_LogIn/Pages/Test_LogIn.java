package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_LogIn {

	public WebDriver driver;
	public WebElement username;
	public WebElement password;
	public WebElement submit;
	public WebElement wronguser;
	public WebElement wrongpass;
	public Test_LogIn(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getUsername() {
		return driver.findElement(By.id("username"));
	}
	public WebElement getPassword() {
		return driver.findElement(By.id("password"));
	}
	public WebElement getSubmit() {
		return driver.findElement(By.id("submit"));
	}
	public void inputUsername(String usernameData) {
		this.getUsername().sendKeys(usernameData);
		
	}
	public void inputPassword(String passwordData) {
		this.getPassword().sendKeys(passwordData);
		
	}
	public WebElement Error() {
		return driver.findElement(By.id("error"));
	}
	
	
}
