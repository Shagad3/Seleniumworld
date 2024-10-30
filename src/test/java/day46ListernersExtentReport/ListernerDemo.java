package day46ListernersExtentReport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernerDemo implements ITestListener{
	
	public void onStart(ITestContext context) {
		System.out.println("Test execution is started ...");
	}
	public void onTeststart(ITestResult result) {
		System.out.println("Test  started ...");
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed ...");
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed...");
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped...");
	}
	public void onTestFinished(ITestResult result) {
		System.out.println("Test finished...");
	}
}
