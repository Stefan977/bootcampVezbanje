package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import Pages.Test_LogIn;
import Pages.Test_LoggedIn;

public class Base_LogIn {

	public WebDriver driver;
    public Test_LogIn test_login;
    public Test_LoggedIn test_loggedin;
    

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
	    driver = new ChromeDriver();
		test_login = new Test_LogIn(driver);
		test_loggedin = new Test_LoggedIn(driver);
		
	}
	
	
	
}
