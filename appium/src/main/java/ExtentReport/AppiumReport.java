package ExtentReport;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

import io.appium.java_client.AppiumDriver;

public class AppiumReport {
	
	static ExtentReports extent;
	public static ExtentReports getReport() {
		String path=System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Report");
		reporter.config().setDocumentTitle("Test Results");
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		return extent;
	}
	
	//Screen Shot
		public String ScreenShot(String testCaseName, AppiumDriver driver) throws IOException {
			File ss = driver.getScreenshotAs(OutputType.FILE);
			String destinationsrc=System.getProperty("user.dir")+"//reports"+testCaseName+".png";
			Files.copy(ss,new File(destinationsrc));
			return destinationsrc;
		}
}
