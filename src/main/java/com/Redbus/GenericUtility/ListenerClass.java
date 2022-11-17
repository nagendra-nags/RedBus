package com.Redbus.GenericUtility;


import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerClass extends BaseClass implements ITestListener {
	public void onTestFailure(ITestResult result) {
		
		String scriptName=result.getTestContext().getName()+"."+result.getMethod().getMethodName();
		driverlib.captureScreeShot(scriptName+".png",driver);
	}
}
