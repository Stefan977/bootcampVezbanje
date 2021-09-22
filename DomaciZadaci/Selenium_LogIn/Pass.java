package SeleniumOsnove;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pass extends Fail {

	
	public Pass() {

	}
	public void happy() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
    	String Urll = "https://the-internet.herokuapp.com/login";
    	driver.navigate().to(Urll);
    	WebElement userNam = driver.findElement(By.id("username"));
    	userNam.sendKeys("tomsmith");
    	WebElement pasWord = driver.findElement(By.id("password"));
    	pasWord.sendKeys("SuperSecretPassword!");
    	WebElement buton = driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
    	buton.click();
    	WebElement fail = driver.findElement(By.id("flash"));
    	String failedd = fail.getText();
    	System.out.println(failedd);
        if(failedd.contains("logged")) {
			System.out.println("Pass");
			
		}
			
	}
}

