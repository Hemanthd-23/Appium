package Selenium.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Controls extends Onboard {
@Test
public void contol() throws InterruptedException 
{
	//swipe to controls
	Thread.sleep(2000);
	WebElement ele2 = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']"));
	((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId", ((RemoteWebElement) ele2).getId(),"direction", "left","percent",0.75 ));
	
	
	//swiping up
	WebElement ele3 = driver.findElement(By.className("android.widget.ScrollView"));
	((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId", ((RemoteWebElement) ele3).getId(),"direction", "up","percent",0.75 ));
	
	//hillhold
	for(int i=0;i<2;i++)
	{
	driver.findElement(AppiumBy.accessibilityId("HILL HOLD")).click();
	}
	
	//Abs
	for(int i=0;i<2;i++)
	{
	driver.findElement(AppiumBy.accessibilityId("ABS")).click();
	}
	
	//TC
	for(int i=0;i<2;i++)
	{
	driver.findElement(AppiumBy.accessibilityId("TC")).click();
	}
	
	/*regen
	for(int i=0;i<2;i++)
	{
	driver.findElement(AppiumBy.accessibilityId("TC")).click();
	}*/
	
	WebElement ele4 = driver.findElement(By.className("android.widget.SeekBar"));
	
	((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) ele4).getId(),
		    "endX", 763,
		    "endY", 1461
		));
	
}
}
 