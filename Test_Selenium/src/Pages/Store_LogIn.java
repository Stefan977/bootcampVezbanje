package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Store_LogIn {

	public WebDriver driver;
	public WebElement logIn;
	public WebElement username;
	public WebElement password;
	public WebElement button;
	public WebElement s6;
	public WebElement s7;
	public WebElement mcAir;
	public WebElement next;
	public WebElement cart;
	public WebElement user;
	public WebElement logout;
	public WebElement contact;
	public WebElement email;
	public WebElement name;
	public WebElement message;
	public WebElement sendmsg;
	public Store_LogIn(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getLogIn() {
		return driver.findElement(By.cssSelector("#login2"));
	}
	public WebElement getUsername() {
		return driver.findElement(By.cssSelector("#loginusername"));
	}
	public WebElement getPassword() {
		return driver.findElement(By.cssSelector("#loginpassword"));
	}
	public WebElement getButton() {
		return driver.findElement(By.cssSelector("body.modal-open:nth-child(2) div.modal.fade.show:nth-child(3) div.modal-dialog div.modal-content div.modal-footer > button.btn.btn-primary:nth-child(2)"));
	}
	public void inputUsername(String username) {
		getUsername().sendKeys(username);
	}
	public void inputPassword(String password) {
		getPassword().sendKeys(password);
	}
	public void submit() {
		getButton().click();
	}
	public void logIn() {
		getLogIn().click();
	}
	public WebElement getS6() {
		return driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]"));
	}
	public WebElement getS7() {
		return driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s7')]"));
	}
	public WebElement getMcAir() {
		return driver.findElement(By.xpath("//a[contains(text(),'MacBook air')]"));
	}
	public WebElement getNext() {
		return driver.findElement(By.cssSelector("#next2"));
	}
	public WebElement getCart() {
		return driver.findElement(By.xpath("//a[@id='cartur']"));
	}
	public WebElement getUser() {
		return driver.findElement(By.cssSelector("#nameofuser"));
	}
	public WebElement getLogout() {
		return driver.findElement(By.cssSelector("#logout2"));
	}
	public WebElement getContact() {
		return driver.findElement(By.xpath("//a[contains(text(),'Contact')]"));
	}
	public WebElement getEmail() {
		return driver.findElement(By.xpath("//input[@id='recipient-email']"));
	}
	public WebElement getName() {
		return driver.findElement(By.xpath("//input[@id='recipient-name']"));
	}
	public WebElement getMessage() {
		return driver.findElement(By.xpath("//textarea[@id='message-text']"));
	}
	public void inputEmail(String email) {
		getEmail().sendKeys(email);
	}
	public void inputName(String name) {
		getName().sendKeys(name);
	}
	public void inputMessage(String message) {
		getMessage().sendKeys(message);
	}
	public WebElement getSendmsg() {
		return driver.findElement(By.xpath("//button[contains(text(),'Send message')]"));
	}
	
}
