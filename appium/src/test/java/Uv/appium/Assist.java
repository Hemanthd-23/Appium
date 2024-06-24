package Uv.appium;

import org.testng.annotations.Test;

import actionClass.Actions;
import appium.xpath.AssistPage;

public class Assist extends Basetest{
@Test
	public void assist() throws InterruptedException {
	AssistPage as=new AssistPage(driver);
	Actions a=new Actions(driver);
	
	as.assist();
	Thread.sleep(2000);
	as.feedback();
	Thread.sleep(2000);
	as.GiveFeedback();
	Thread.sleep(2000);
	if(as.ReportIssue.isEnabled())
		System.out.println("Feedback button is enabled");
	a.AndriodBack();
	as.userManual();
	Thread.sleep(2000);
	as.search();
	for(int i=0;i<3;i++) {
	a.AndriodBack();
	}
	Thread.sleep(2000);
	as.roadSideAssist();
	Thread.sleep(2000);
	for(int i=0;i<2;i++) {
		a.AndriodBack();
	}
	Thread.sleep(2000);
	as.FAQ();
	Thread.sleep(2000);
	a.AndriodBack();
	as.contactUs();
	Thread.sleep(2000);
	for(int i=0;i<2;i++) {
		a.AndriodBack();
	}
}
}
