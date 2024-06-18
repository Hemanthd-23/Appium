package Uv.appium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import actionClass.Actions;
import appium.xpath.DiagnosticPage;

public class Diagnostics extends Basetest {
	@Test
	public void diagnostic() throws InterruptedException
	{
	DiagnosticPage dig=new DiagnosticPage(driver);
	Actions a=new Actions(driver);
	
	for(int i=0;i<2;i++) {
	a.SwipeActions(dig.homePage,"left");
	Thread.sleep(2000);
	}
	a.SwipeActions(dig.homePage,"up");
	Thread.sleep(2000);
	
	//TPMS
	dig.tpms();
	Thread.sleep(2000);
	
	//verifing rear tpms
	String RearValue = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Rear\"]/following-sibling::android.view.View[1]")).getAttribute("content-desc");
	String RearPressure = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Rear\"]/following-sibling::android.view.View[2]")).getAttribute("content-desc");
	String[] s=RearPressure.split(" ");
	int i=Integer.parseInt(s[0]);
	if(i<27) {
		Assert.assertEquals(RearValue, "LOW");
	}
	else if((i>=27||i<=37)) {
		Assert.assertEquals(RearValue, "IDEAL");
	}
	else if(i>37) {
		Assert.assertEquals(RearValue, "HIGH");
	}
	else
	{
		System.out.println("Error in rear tpms");
	}
	
	a.AndriodBack();
	Thread.sleep(2000);
	
	//Charge limit

	dig.energy();
	Thread.sleep(2000);
	dig.chargeHistoryView();
	Thread.sleep(2000);
	for(int k=0;k<2;k++) {
	a.AndriodBack();
	}
	Thread.sleep(2000);
	
	
	//schedule service
	dig.scheduleService();
	Thread.sleep(2000);
	
	//regular
	dig.regularService();
	dig.feedbackDescription();
	a.AndriodBack();
	Thread.sleep(2000);
	dig.feedbackPhoto();
	Thread.sleep(2000);
	
	if(dig.SubmitFeedback.isEnabled())
		System.out.println("Submit button is enabled in Regular");
	else
		System.out.println("Submit button is not enabled in regular");
	a.AndriodBack();
	Thread.sleep(2000);
	
	//Issue
	dig.issueService();
	dig.feedbackDescription();
	a.AndriodBack();
	Thread.sleep(2000);
	dig.feedbackPhoto();
	Thread.sleep(2000);
	
	if(dig.SubmitFeedback.isEnabled())
		System.out.println("Submit button is enabled in isuue");
	else
		System.out.println("Submit button is not enabled in isuue");
	a.AndriodBack();
	Thread.sleep(2000);
	
	//Accident
	dig.accidentService();
	dig.feedbackDescription();
	a.AndriodBack();
	Thread.sleep(2000);
	dig.feedbackPhoto();
	Thread.sleep(2000);
	
	if(dig.SubmitFeedback.isEnabled())
		System.out.println("Submit button is enabled in Accident");
	else
		System.out.println("Submit button is not enabled in Acccident");
	a.AndriodBack();
	Thread.sleep(2000);
	
	//swipe down
	a.AndriodBack();
	Thread.sleep(2000);
	
	}
}
