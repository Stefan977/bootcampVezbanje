package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import Pages.IMDB;
import Pages.IMDB_LogIn;
import Pages.IMDB_LogInImdb;

public class Base_IMDB {

	public WebDriver driver;
	public IMDB imdb;
	public IMDB_LogIn imdb_login;
	public IMDB_LogInImdb imdb_loginimdb;
	
	 @BeforeClass
	    public void setUp() {
	    System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
	    driver = new ChromeDriver();
	    imdb = new IMDB(driver);
	    imdb_login = new IMDB_LogIn(driver);
	    imdb_loginimdb = new IMDB_LogInImdb(driver);
	    }
}
