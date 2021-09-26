package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_LoggedIn {
     
	public WebDriver driver;
	public WebElement logOut;
	public WebElement text1;
	public WebElement text2;
	public String url = "https://practicetestautomation.com/logged-in-successfully/";
	public Test_LoggedIn(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getLogOut() {
		return driver.findElement(By.cssSelector(".wp-block-button__link.has-text-color.has-background.has-very-dark-gray-background-color"));
	}
    public WebElement getText1() {
    	return driver.findElement(By.className("post-title"));
    }
	public WebElement getText2() {
		return driver.findElement(By.className("has-text-align-center"));
			
	}
	public String getUrl() {
		return url;
	}
	
}
