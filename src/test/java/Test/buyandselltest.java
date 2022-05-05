package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.ZerodhaLogin;
import POM.buyandsell;
import Pojo.Browser;
import Utility.Excel;

public class buyandselltest {
WebDriver driver;
	
	@BeforeMethod
	public void LaunchBrowser() throws EncryptedDocumentException, IOException {
	driver=Browser.OpenBrowser("https://kite.zerodha.com/");
	ZerodhaLogin zerodhalogin=new ZerodhaLogin(driver);
	String user=Excel.gettestdata(0, 1, "cred1");
	zerodhalogin.enterUserName().sendKeys(user);
	String pass=Excel.gettestdata(1, 1, "cred1");
	zerodhalogin.enterPassword(pass);
	zerodhalogin.clickonsubmite();
	
	String pin=Excel.gettestdata(2, 1, "cred1");
	zerodhalogin.enterpin(pin, driver);
	zerodhalogin.continuee();
	}
//	
//	@Test
//	public void element() throws InterruptedException, EncryptedDocumentException, IOException
//	{
//		
//		
//		Thread.sleep(3000);
//		buyandsell bys=new buyandsell(driver);
//		System.out.println(bys.logo());
//	}

	@Test
	public void addshares() throws InterruptedException {
		
		buyandsell bys=new buyandsell(driver);
		
		bys.clickonwatchlist();
		
		bys.serachshares("idea");
		bys.sle();
		//bys.clickonadd();
		
	}
	
	
}
