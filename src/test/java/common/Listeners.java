package common;


import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilites.testUtils;

//ITestListener ==> A listener for test running.
public class Listeners extends testUtils implements ITestListener {
	public void onTestStart(ITestResult result) {
		Reporter.log("The method name is "+result.getName());
		System.out.println("Test case is start");
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("The method name is "+result.getStatus());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case is fail");
		try {
			getScreenShort();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFinish(ITestResult result) {

	}

}
