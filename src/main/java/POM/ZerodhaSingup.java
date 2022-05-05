package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSingup {
	@FindBy(xpath = "//a[text()=\"Don't have an account? Signup now!\"]")private WebElement singuppage;
	@FindBy(xpath = "//img[@class='logo-img']")private WebElement logo1;
	@FindBy(xpath ="//a[text()='Signup']")private WebElement singuptab;
   @FindBy(xpath = "//div[@id='menu_btn']")private WebElement movetoline;
   @FindBy (xpath = "(//a[@class='text-center'])[1]")private WebElement kite;
   @FindBy(xpath = "//input[@id='user_mobile']")private WebElement mobilenumber;
   @FindBy(xpath = "//button[@id=\"open_account_proceed_form\"]")private WebElement continue1;
   @FindBy(xpath = "//i[@class=\"icon-instagram\"]")private WebElement instagram;
   
   
   public ZerodhaSingup(WebDriver driver) {
	   PageFactory.initElements(driver, this);
	   
   }
   
   
public void entermobilenumber(String num) {
	mobilenumber.sendKeys(num);
}
   

}
