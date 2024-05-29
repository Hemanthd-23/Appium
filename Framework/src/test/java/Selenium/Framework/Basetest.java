package Selenium.Framework;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Basetest {
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	@Test
	public void configure() throws MalformedURLException, InterruptedException
	{
		//service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\ramya\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
		//service.start();
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Galaxy A35 5G");
		options.setApp("C:\\Users\\ramya\\Downloads\\app-debug.apk");
		driver =new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
}
}
	
