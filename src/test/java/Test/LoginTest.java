package Test;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import POM.ZerodhaLogin;
import POM.ZerodhaSingup;
import Pojo.Browser;
import Utility.Excel;
import Utility.ScreenShot;

public class LoginTest {

	WebDriver driver;
	
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
		
	}
	

	@Test
	public void forgotpass() {
		ZerodhaLogin zerodhaLogin =new ZerodhaLogin(driver);
		zerodhaLogin.clickonforgot();
	}
		@Test
		public void creatnewacc() {
			ZerodhaLogin zerodhaLogin =new ZerodhaLogin(driver);
			zerodhaLogin.clickondonthavaccount();
			zerodhaLogin.tabswitch(driver, 1);
			
		String actualTitle=	driver.getTitle();
		String expectedTitle="Signup and open  Zerodha trading and demat account online and start investing – Zerodha";
		//SoftAssert sowftassert= new SoftAssert();
		//sowftassert.assertEquals(actualTitle, expectedTitle);
		//Assert.assertEquals(actualTitle, expectedTitle);
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actualTitle, expectedTitle);
		
		
		ZerodhaSingup zerodhasingup=new ZerodhaSingup(driver);
		zerodhasingup.entermobilenumber("98452154");
		//sowftassert.assertAll();
		soft.assertAll();
		}
	
	@Test
	public void logop() {
		ZerodhaLogin zerodhaLogin=new ZerodhaLogin(driver);
		zerodhaLogin.logoo();
	}
	@AfterMethod
	
	
	public void Screenshot() throws IOException, InterruptedException {
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	//Thread.sleep(2000);
		ScreenShot.screenshot(driver, "Loginpage");
	}
}
