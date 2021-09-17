package Selenium_Zadatak1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogiIn {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe" );
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://practicetestautomation.com/");
		WebElement practiceButton = driver.findElement(By.id ("menu-item-20"));
		practiceButton.click();
		driver.findElement(By.xpath("/html/body/div/div/section/div/div/article/div[2]/div[1]/div[1]/p/a")).click();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("student");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Password123");
		WebElement submitButton = driver.findElement(By.id ("submit"));
		submitButton.click();
		WebElement logOut = driver.findElement(By.cssSelector(".wp-block-button__link.has-text-color.has-background.has-very-dark-gray-background-color"));
		logOut.click();
		driver.close();

		
		
		
		
	    
	    
//	    driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
//	    driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();
		
		
		
		
		
		
	
		
	}
	
}
