package Uv.appium;

import org.testng.annotations.Test;

import actionClass.Actions;
import appium.xpath.SettingsPage;

public class Settings extends Basetest {
@Test
	public void settings() throws InterruptedException {
	SettingsPage s=new SettingsPage(driver);
	Actions a=new Actions(driver);
	
	s.settings();
	Thread.sleep(2000);
	s.personalInfo();
	Thread.sleep(2000);
	a.AndriodBack();
	s.documents();
	Thread.sleep(2000);
	try {
	s.AddDocument(s.DrivingLicense);
	}
	catch(Exception e) {
		System.out.println("DL is already added");
	}
	a.SwipeActions(s.DrivingLicense,"left");
	Thread.sleep(2000);
	try {
	s.AddDocument(s.Insurance);
	}	
	catch(Exception e) {
	System.out.println("Insurance is already added");
	}
	a.SwipeActions(s.Insurance,"left");
	Thread.sleep(2000);
	try {
		s.AddDocument(s.Registration);
	}	
	catch(Exception e) {
	System.out.println("Registration is already added");
	}
	a.AndriodBack();
	Thread.sleep(2000);
	s.violette();
	Thread.sleep(2000);
	s.crashAlert();
	Thread.sleep(2000);
	try {
	s.updateConatct();
	}
	catch(Exception e) {
	s.Allow();
	s.updateConatct();
	}
	a.AndriodBack();
	Thread.sleep(2000);
	s.ACWS();
	Thread.sleep(2000);
	s.DeltaWatchIndication();
	Thread.sleep(2000);
	s.MotorArmedWarning();
	a.AndriodBack();
	Thread.sleep(2000);
	s.DeltaWatch();
	Thread.sleep(2000);
	s.MovementAlert();
	s.FallAlert();
	s.TowAlert();
	Thread.sleep(2000);
	for(int i=0;i<2;i++) {
	a.AndriodBack();
	}
	s.vehicleInfo();
	Thread.sleep(2000);
	a.AndriodBack();
	s.update();
	a.AndriodBack();
	s.logout();
}
}
