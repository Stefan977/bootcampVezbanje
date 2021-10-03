package Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Store_Base;

public class Store_Test extends Store_Base {

	@BeforeMethod
	public void pageSetUp() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.demoblaze.com/index.html");

	}

	@Test(priority = 10)
	public void succesfullLogIn() throws InterruptedException { // Checking to see if User can LogIn with the right
																// credentials.
		store_login.logIn();
		Thread.sleep(1000);
		String username = xcelreader.getStringData("Log", 1, 1);
		String password = xcelreader.getStringData("Log", 1, 2);
		store_login.inputUsername(username);
		store_login.inputPassword(password);
		store_login.submit();
		wd.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#logout2")));
		;
		assertTrue(store_login.getLogout().isDisplayed()); // Checking to see if user is logged in by checking "LogOut"
															// button is displayed.
		assertTrue(store_login.getUser().isDisplayed()); // Checking to see if instead of sign up "Welcome User"
															// appeared.
	}

	@Test(priority = 20)
	public void incorrectUsername() throws InterruptedException { // Checking to see if User can LogIn with correct
														// "Password" but incorrect "Username".
		store_login.logIn();
		for (int i = 1; i < 6; i++) {
			String username = xcelreader.getStringData("Log", i, 3);
			String password = xcelreader.getStringData("Log", 1, 2);
			store_login.getUsername().clear();
			store_login.getPassword().clear();
			store_login.inputUsername(username);
			store_login.inputPassword(password);
			store_login.submit();
			Thread.sleep(500);
			Alert alert = driver.switchTo().alert();
			alert.accept();
			assertFalse(store_login.getLogout().isDisplayed());// Checking to see if User is not logged in by checking
																// if the "LogOut" button is displayed.
		}
	}

	@Test(priority = 30)
	public void incorrectPassword() throws InterruptedException {// Checking to see if User can LogIn with correct																// "Username" but incorrect "Password".
		store_login.logIn();
		for (int i = 1; i < 5; i++) {
			String username = xcelreader.getStringData("Log", 1, 1);
			String password = xcelreader.getStringData("Log", i, 4);
			store_login.getUsername().clear();
			store_login.getPassword().clear();
			store_login.inputUsername(username);
			store_login.inputPassword(password);
			store_login.submit();
			Thread.sleep(500);
			Alert alert = driver.switchTo().alert();
			alert.accept();
			assertFalse(store_login.getLogout().isDisplayed());// Checking to see if User is not logged in by checking
																// if the "LogOut" button is displayed.
		}
	}

	@Test(priority = 40)
	public void addingElementsIntoCart() throws InterruptedException {//Checking to see if User can add items into cart
		store_login.logIn();
		Thread.sleep(500);
		String username = xcelreader.getStringData("Log", 1, 1);
		String password = xcelreader.getStringData("Log", 1, 2);
		store_login.inputUsername(username);
		store_login.inputPassword(password);
		store_login.submit();
		Thread.sleep(1000);
		store_login.getS7().click();
		Thread.sleep(2000);
		addtocart.getAdd().click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		store_login.getCart().click();
		Thread.sleep(2000);
		assertTrue(cart.getCartlist().getText().contains("Samsung galaxy s7"));// Checking to see if the cart got the item the USer wants
		Thread.sleep(2000);
		cart.getDelete().click();
		try {
		Thread.sleep(2000);
		assertFalse(cart.getDelete().isDisplayed());
		}
		catch(Exception e) {
			System.out.println("The Cart is empty");
		}
		}
	@Test(priority = 60)
    public void AddintSamsungS6AndMacBookAirIntoCart() throws InterruptedException {//Checking to see if User can add there 2 specific items
		store_login.logIn();
		Thread.sleep(500);
		String username = xcelreader.getStringData("Log", 1, 1);
		String password = xcelreader.getStringData("Log", 1, 2);
		store_login.inputUsername(username);
		store_login.inputPassword(password);
		store_login.submit();
		Thread.sleep(2000);
		store_login.getS7().click();
		Thread.sleep(2000);
		addtocart.getAdd().click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		addtocart.getHome().click();
		Thread.sleep(1000);
		store_login.getNext().click();
		Thread.sleep(1000);
		store_login.getMcAir().click();
		Thread.sleep(2000);
		addtocart.getAdd().click();
		Thread.sleep(1000);
		alert = driver.switchTo().alert();
		alert.accept();
		store_login.getCart().click();
		Thread.sleep(3000);
		assertTrue(cart.getCartlist().getText().contains("Samsung galaxy 7"));// Checking to see if the cart got the item the USer wants
		cart.getDelete().click();
		Thread.sleep(2000);
		assertTrue(cart.getCartlist().getText().contains("MacBook"));// Checking to see if the cart got the item the USer wants
		cart.getDelete().click();
		Thread.sleep(2000);
		try {
			Thread.sleep(2000);
			assertFalse(cart.getDelete().isDisplayed());
			}
			catch(Exception e) {
				System.out.println("The Cart is empty");
			}
	}
		@Test(priority = 50)
		public void ContactingTheWebStie() throws InterruptedException {//This is a bug you can contact them with invalid email
			Thread.sleep(2000);
			for (int i = 1; i < 5; i++) {
			store_login.getContact().click();
			String email = xcelreader.getStringData("Log", i, 3);
			String name = xcelreader.getStringData("Log", 2, 2);
			String message = xcelreader.getStringData("Log", 2, 2);
			store_login.inputEmail(email);
			store_login.inputName(name);
			store_login.inputMessage(message);
			store_login.getSendmsg().click();
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			alert.accept();
			Thread.sleep(1000);
			
		}
		}
		
		
		
	
	@AfterMethod
	public void pageTearDown() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	
}
	

