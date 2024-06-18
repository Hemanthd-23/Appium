package actionClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Actions {
	
AndroidDriver driver;
public Actions(AndroidDriver driver) {
	this.driver=driver;
}
//"+varibale+" usefull in actions class

//Swiping Action
public void SwipeActions(WebElement elementId,String DirectionofSwipe) throws InterruptedException
{
	((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId", ((RemoteWebElement) elementId).getId(),"direction", DirectionofSwipe,"percent",0.75 ));
	Thread.sleep(2000);
}

//drag gesture
public void DragActions(WebElement elementid,int x,int y)
{
	((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) elementid).getId(),
		    "endX", x,
		    "endY", y
		));	
	}

//back button andriod
public void AndriodBack() {
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
}




}
