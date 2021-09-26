package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IMDB_LogInImdb {

	public WebDriver driver;
	public WebElement proof;
	public WebElement email;
	public WebElement password;
	public WebElement submit;

	public IMDB_LogInImdb(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getProof() {
		return driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div[1]/div/a/img"));
	}

	public WebElement getEmail() {
		return driver.findElement(By.id("ap_email"));
	}

	public WebElement getPassword() {
		return driver.findElement(By.id("ap_password"));
	}

	public void InputEmail(String EmailData) {
		this.getEmail().sendKeys(EmailData);
	}

	public void InputPassword(String PasswordData) {
		this.getEmail().sendKeys(PasswordData);
	}

	public WebElement getSubmit() {
		return driver.findElement(By.id("signInSubmit"));
	}
	

}
