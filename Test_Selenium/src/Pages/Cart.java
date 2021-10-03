package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {

	public WebDriver driver;
	public WebElement cartlist;
	public WebElement delete;
	public Cart(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getCartlist() {
		return driver.findElement(By.className("success"));
	}
	public WebElement getDelete() {
		return driver.findElement(By.xpath("//a[contains(text(),'Delete')]"));
	}
	
	
}
