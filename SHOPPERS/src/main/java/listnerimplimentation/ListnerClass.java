package listnerimplimentation;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import GenericUtility1.JavaUtility;
import demoTest.BaseClass;

public class ListnerClass implements ISuiteListener, ITestListener
{
	public static ExtentReports report;
	public static ExtentTest tests;
	JavaUtility javaUtility=new JavaUtility();
	public void onFinish(ISuite suite)
    {
		report.endTest(tests) ;
		Reporter.log(suite.getName()+" has Finished", true);
    }
	
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		report=new ExtentReports("./AdvancedReports/"+suite.getName()+javaUtility.getSystemDateWithTime()+".html");
		Reporter.log(suite.getName()+" has started", true);
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		tests.log(LogStatus.PASS,"TestScript passed successfully");
		Reporter.log(result.getName()+"is started", true);
	}
	
	public void onTestSuccess(ITestResult result) 
	{
		// TODO Auto-generated method stub
		tests.log(LogStatus.PASS,"TestScript passed successfully");
		Reporter.log(result.getName()+" is succesfully executed", true);
	}
	
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		tests.long(LogStatus.SKIP,"TestScript skipped successfully");
		Reporter.log(result.getName()+ "has skipped", true);
	}

	public void onTestFailure(ITestResult result) {
		File path=new File("./FailedScreenShots/"+result.getName()+".png");
		TakesScreenshot ts=(TakesScreenshot).driver;
		File ss=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(ss, path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tests.log(LogStatus.INFO, tests.addScreenCapture("."+screenpath));
		tests.log(LogStatus.FAIL, result.getName()+"TestScript Faild");
		Reporter.log(result.getName()+ "is failed and successfully captured the screenshot", true);
		
	}
}


