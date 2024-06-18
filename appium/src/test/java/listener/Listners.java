package listener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import ExtentReport.AppiumReport;
import io.appium.java_client.AppiumDriver;

public class Listners extends AppiumReport implements ITestListener{
		
	    AppiumDriver driver;
		ExtentTest test;
		ExtentReports extent=AppiumReport.getReport();

		
		@Override
		public void onTestStart(ITestResult result) {
			test=extent.createTest(result.getMethod().getMethodName());
		}
		@Override
		public void onTestSuccess(ITestResult result) {
			test.log(Status.PASS, "Test Passed");
		}
		@Override
		public void onTestFailure(ITestResult result) {
			test.fail(result.getThrowable());
			
			try {
				driver=(AppiumDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			try {
				test.addScreenCaptureFromPath(ScreenShot(result.getMethod().getMethodName(),driver), result.getMethod().getMethodName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		@Override
		public void onTestSkipped(ITestResult result) {
			System.out.println("onTestSkipped Method" +result.getName());
		}
		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			System.out.println("onTestFailedButWithinSuccessPercentage" +result.getName());
		}
		
		@Override
		public void onFinish(ITestContext context) {
			extent.flush();
		}

}
