package POM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import Pojo.Browser;
public class singuptest {
	
	WebDriver driver;
	@BeforeMethod
	public void LaunchBrowser() {
	driver=Browser.OpenBrowser("https://kite.zerodha.com/");	
	}

}
