package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class ScreenShot {
	public static String datetime() {
	DateTimeFormatter dt=DateTimeFormatter.ofPattern("yyyy-MM-dd  HH-mm-ss");
	LocalDateTime obj= LocalDateTime.now();
	String d =dt.format(obj);
	return d;
	}
	
	public static void screenshot(WebDriver driver, String Name ) throws IOException  {
	//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		String dt=ScreenShot.datetime();
		
		File sa = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
		File da = new File("F:\\eclipse\\zerodha8jan\\ScreenShot\\"+Name+dt+".jpg");
		FileHandler.copy(sa, da);
	}

}
