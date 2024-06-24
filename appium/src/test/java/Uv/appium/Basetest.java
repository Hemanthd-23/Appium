package Uv.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Basetest {
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	public String lastExecutedMethodName;
	@BeforeClass(alwaysRun = true)
	
	public void configure() throws MalformedURLException, InterruptedException
	{
//		service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Hemanth D\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
//		service.start();
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Galaxy A35 5G");
		options.setApp("C:\\Users\\Hemanth D\\Downloads\\app-debug.apk");
		options.setCapability("noReset", true);
		options.setCapability("fullReset", false);
		driver =new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		//driver.terminateApp("app.ultraviolette.uv_mobile_app");
		//driver.activateApp("app.ultraviolette.uv_mobile_app");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
}
	 @AfterMethod(alwaysRun = true)
	    public void afterMethod(ITestResult result) {
	       lastExecutedMethodName = result.getMethod().getMethodName();
	    }

	    @AfterClass(alwaysRun = true)
	    public void close() {
	        System.out.println("Last executed method: " + lastExecutedMethodName);
	    }
}
	
