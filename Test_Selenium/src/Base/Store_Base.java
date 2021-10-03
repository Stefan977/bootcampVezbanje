package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Pages.AddToCart;
import Pages.Cart;
import Pages.Store_LogIn;

public class Store_Base {

	public WebDriver driver;
	public XcelReader xcelreader;
	public Store_LogIn store_login;
	public AddToCart addtocart;
	public Cart cart;
	public WebDriverWait wd;
	
	@BeforeClass
	public void setUp() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		store_login = new Store_LogIn(driver);
		addtocart = new AddToCart(driver);
		cart = new Cart(driver);
		wd = new WebDriverWait(driver, 20);
		xcelreader = new XcelReader("C:\\Users\\Korisnik\\Desktop\\DataTest.xlsx");
	}
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
