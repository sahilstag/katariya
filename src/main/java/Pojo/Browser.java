package Pojo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {

		
		public static WebDriver OpenBrowser(String url) {
			ChromeOptions wp=new ChromeOptions();
			wp.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver","F:\\eclipse\\zerodha8jan\\src\\main\\resources\\chromedriver.exe");
			WebDriver driver =new ChromeDriver(wp);
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
			return driver;
		}

}
