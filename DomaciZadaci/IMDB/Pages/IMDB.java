package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IMDB {
   
	
	public WebDriver driver;
	public WebElement watchlistButton;
	public WebElement watchlist;
	public WebElement proof;
	public IMDB(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getWatchlistButton() {
		return driver.findElement(By.cssSelector(".NavWatchlistButton-sc-1b65w5j-0.dAMWXo imdb-header__watchlist-button"));
	}
	public WebElement getWatchlist() {
		return driver.findElement(By.cssSelector(".ipc-icon.ipc-icon--add.ipc-button__icon.ipc-button__icon--pre"));
	}
	public void submitFilm() {
		this.getWatchlist().click();
	}
	public void Watchlist() {
		this.getWatchlistButton().click();
	}
	public WebElement getProof() {
		return driver.findElement(By.cssSelector(".ipc-sub-grid.ipc-sub-grid--page-span-3.ipc-sub-grid--nowrap.ipc-shoveler__grid"));
	}
	
			
}
