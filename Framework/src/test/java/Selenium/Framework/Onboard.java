package Selenium.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Onboard extends Basetest {
@Test

public void Onboards() throws InterruptedException{
	
	Thread.sleep(3000);
	driver.findElement(AppiumBy.accessibilityId("Get Started")).click();
	Thread.sleep(1000);
	WebElement ele=	driver.findElement(By.xpath("//android.widget.EditText"));
	ele.click();
	Thread.sleep(1000);
	ele.sendKeys("8431411160");
	
	//if entered less than 10 numbers
	
	if(driver.getPageSource().contains("Please enter a valid phone number"))
		System.out.println("Pass");
	else
		System.out.println("Fail error msg in phone no");

	//otp
	
	driver.findElement(AppiumBy.accessibilityId("Continue")).click();
	Thread.sleep(15000);
	driver.findElement(AppiumBy.accessibilityId("Continue")).click();
	
	//swipe up welcome text verification
	if(driver.getPageSource().contains("WELCOME BACK TO"))
		System.out.println("Pass");
	else
		System.out.println("Fail Welocme text in swipe up");
	
	//swipe up
	
	WebElement ele1=driver.findElement(By.className("android.widget.ScrollView"));
	((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId", ((RemoteWebElement) ele1).getId(),"direction", "up","percent",0.75 ));
		
	//Setting up
	
	Thread.sleep(2000);
	for(int i=1;i<=4;i++) 
	{
	driver.findElement(AppiumBy.accessibilityId("NEXT")).click();
	}
	
	driver.findElement(AppiumBy.accessibilityId("FINISH")).click();
	
	//permissions
	
	Thread.sleep(2000);
	for(int i=1;i<=3;i++) 
	{
		driver.findElement(By.className("android.widget.Button")).click();
	}
	
	}
}
