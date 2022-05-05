package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class buyandsell {
	WebDriver driver;
	@FindBy(xpath = "//li[@data-balloon='3']")private WebElement watchlist3;
	@FindBy(xpath = "//input[@type=\"text\"]")private WebElement search;
	@FindBy(xpath = "//button[@data-balloon=\"Add\"]")private WebElement add;
@FindBy(xpath = "//img[@alt=\"Kite logo\"]")private WebElement logo1;
@FindBy(xpath = "(//li[@class=\"search-result-item\"])[1]")private WebElement ideaa;

public buyandsell(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
public void sle() {
	ideaa.click();
	
}
public boolean logo() {
	return logo1.isDisplayed();
	
}
public void clickonwatchlist() {
	watchlist3.click();
}


public void serachshares(String share) {
	search.sendKeys(share);
}

public void clickonadd() {
	add.click();
}
}