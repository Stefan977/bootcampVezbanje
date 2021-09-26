package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base_IMDB;

public class Test_IMDB extends Base_IMDB {
	
	@BeforeMethod
	public void pageSetUp() throws InterruptedException {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.imdb.com/?ref_=ls_mv_close");
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
	}
	@Test(priority = 10)
	public void addingToWatchlistWithoutLogingIn() throws InterruptedException {
		imdb.submitFilm();
		assertTrue(imdb_login.getLogIn().isDisplayed());
		
	}
	@Test(priority = 20)
	public void CheckingIfLogInImdbIsDisplayed() throws InterruptedException {
		imdb.submitFilm();
		imdb_login.getLogInImdb().click();
		imdb_loginimdb.getEmail().sendKeys("unkownsame56@gmail.com");
		imdb_loginimdb.getPassword().sendKeys("gasnamax69");
		imdb_loginimdb.getSubmit().click();
		Thread.sleep(2000);
	}
	@Test(priority = 30)
	public void CheckingWatchListForMovies() throws InterruptedException {
		ArrayList<String> a = new ArrayList<String>();
		a.add(imdb.getProof().getText());
		for(int i = 0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		assertNotEquals(a, null);
	}
			
	
	@AfterMethod
	public void DeleteCookies() {
		driver.navigate().refresh();
	}

}
