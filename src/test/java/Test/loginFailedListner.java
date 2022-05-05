package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.ZerodhaLogin;
import Pojo.Browser;
import Utility.Excel;
@Listeners(Listnertest.class)
public class loginFailedListner extends Basetest {
// EQ= project me failed test cases ke ss kaise liye?
// Ans:-by using listner interface & listner annotaion humne failed test cases ke ss liye 
	
//EQ= inhertitance kaha use kiya?
// Ans= listner me ek base class banaya jaha static webdriver initate kiya 
// fir wo extend kiya test class me and listner class me 
	
// public static webDriver driver; he base class madhun yet 
	
	@BeforeMethod
	public void LaunchBrowser() {
	driver=Browser.OpenBrowser("https://kite.zerodha.com/");	
	}
	
	@Test
	public void LoginwithValidCredentials() throws EncryptedDocumentException, IOException {
		ZerodhaLogin zerodhalogin=new ZerodhaLogin(driver);
		String user=Excel.gettestdata(0, 1, "cred1");
		zerodhalogin.enterUserName().sendKeys(user);
		String pass=Excel.gettestdata(1, 1, "cred1");
		zerodhalogin.enterPassword(pass);
		zerodhalogin.clickonsubmite();
		
		String pin=Excel.gettestdata(2, 1, "cred1");
		zerodhalogin.enterpin(pin, driver);
		zerodhalogin.continuee();
		Assert.assertTrue(false);
	}
	
}
