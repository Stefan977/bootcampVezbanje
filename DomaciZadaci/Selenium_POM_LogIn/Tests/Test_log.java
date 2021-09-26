package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base_LogIn;
import Pages.Test_LogIn;



public class Test_log extends Base_LogIn {
 
	@BeforeMethod
	public void pageSetUp() throws InterruptedException{
		driver.manage().window().maximize();
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
	}
		@Test(priority = 10)
		public void SuccesefullLogIn() {
			test_login.getUsername().sendKeys("student");
			test_login.getPassword().sendKeys("Password123");
			test_login.getSubmit().click();
			String a = driver.getCurrentUrl();
			assertEquals(a, test_loggedin.getUrl());
			test_loggedin.getLogOut();
			assertTrue(test_loggedin.getLogOut().isDisplayed());
			assertTrue(test_loggedin.getText1().isDisplayed());
			assertTrue(test_loggedin.getText2().isDisplayed());
		}
		@Test(priority = 20)
		public void WrongUsername() {
			test_login.getUsername().sendKeys("abc");
			test_login.getPassword().sendKeys("Password123");
			test_login.getSubmit().click();
			String text = "Your username is invalid!";
			assertEquals(test_login.Error().getText(), text);
		}
		@Test(priority = 30)
		public void WrongPassword() {
			test_login.getUsername().sendKeys("student");
			test_login.getPassword().sendKeys("123");
			test_login.getSubmit().click();
			String text = "Your password is invalid!";
			assertEquals(test_login.Error().getText(), text);
		}
	}
	



     

