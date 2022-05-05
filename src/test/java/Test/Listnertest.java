package Test;

import java.io.IOException;


import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.ScreenShot;

public class Listnertest extends Basetest implements ITestListener{
	
	
	public void onTestStart(ITestResult result) {
		System.out.println("started  " + result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("my test is successful "+ result.getName());
	}
	//screen shot try and catch madhe ghavalagte ,ani base class extend karava lagto
	//jo ki static webdriver chi value loginfailedlistner class madhun gheto
	//screenshot ch exception throw nahi kartA YET 
	public void onTestFailure(ITestResult result) {
		try {
			ScreenShot.screenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("my test skipped  "+ result.getName());
	}
	
}
