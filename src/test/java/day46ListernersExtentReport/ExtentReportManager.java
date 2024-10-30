package day46ListernersExtentReport;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
 
	public ExtentSparkReporter sparkReporter; //UI of the report
	public ExtentReports extent; //populate common info on the report
	public ExtentTest test; //creating test cases entries in the report and update status of thtest methods
	
	public void onStart(ITestContext context) {
		
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+ "/reports/myreport.html");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("shashankPC", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Pavan");
		extent.setSystemInfo("os", "Windows10");
		extent.setSystemInfo("Browser name", "chrome");
			
	}
	
	public void onTestSuccess(ITestResult result)
	{
		
		test = extent.createTest(result.getName());
		test.log(Status.PASS, "Test case passed is:" + result.getName());
		
	}
	public void onTestFailure(ITestResult result)
	{
		
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case Failed is:" + result.getName());
		test.log(Status.FAIL, "Test case Failed cause is:" + result.getThrowable());

	}
	public void onTestSkipped(ITestResult result)
	{
		
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case Failed is:" + result.getName());
		

	}
	
	
	public void onFinish(ITestContext context) {
		
		extent.flush();
	}
}
