package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart {

	public WebDriver driver;
	public WebElement add;
	public WebElement header;
	public WebElement home;
	public AddToCart(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getAdd() {
		return driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a"));
	}
	public WebElement getHeader() {
		return driver.findElement(By.xpath("//h2[contains(text(),'Samsung galaxy s6')]"));
	}
	public WebElement getHome() {
		return driver.findElement(By.xpath("//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
	}
	
	
}
