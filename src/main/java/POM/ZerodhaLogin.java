package POM;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaLogin {
	@FindBy(xpath="//input[@id='userid']") private WebElement userName;
	@FindBy(xpath = "//input[@id='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgot;
	@FindBy(xpath="(//a[@target='_blank'])[3]")private WebElement dnothaveAccount;
	@FindBy(xpath = "//input[@id='pin']")private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continu;
	@FindBy(xpath = "//img[@alt='Kite']")private WebElement logo;
	
	public  ZerodhaLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);//pagefactory.iinitelements will find all the elements declared at start
	}
	
	
	   
	   public String gettitle(WebDriver driver) {
		   return driver.getTitle();
	   }
	   
	
	public void logoo() {
		boolean s=logo.isDisplayed();
		if(s==true) {
		System.out.println("test case pass for logo");
		}
		else
		{
			System.out.println("logo is not pres");
		}
	}
	
	public WebElement enterUserName(){
		return userName;
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickonsubmite() {
		submit.click();
	}
	
	public void enterpin(String pinn,WebDriver driver) {
		//WebDriverWait wait= new WebDriverWait(driver, 3000);
		//wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys(pinn);
	}
	
	public void continuee() {
		continu.click();
	}
	public void clickonforgot() {
		forgot.click();
	}
	public void clickondonthavaccount() {
		dnothaveAccount.click();
	}
	public void tabswitch(WebDriver driver, int a) {
		Set<String> address=driver.getWindowHandles();
		ArrayList<String>list=new ArrayList<String>(address);
		driver.switchTo().window(list.get(a));
	}


}
