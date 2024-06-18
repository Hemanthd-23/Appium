package Uv.appium;

import org.testng.annotations.Test;

import actionClass.Actions;
import appium.xpath.ContorlsPage;

public class Controls extends Basetest  {
@Test
public void contol() throws InterruptedException
{
	ContorlsPage con=new ContorlsPage(driver);
	Actions a=new Actions(driver);
	
	//swipe left from home page
	a.SwipeActions(con.homePage,"left");
	Thread.sleep(2000);
	
	//swiping up to controls
	a.SwipeActions(con.homePage,"up");
	Thread.sleep(2000);
	con.hillHold();
	Thread.sleep(2000);
	con.abs();
	Thread.sleep(2000);
	con.tc();
	Thread.sleep(2000);
	a.DragActions(con.regen, 763, 1461);
	Thread.sleep(2000);
	con.energy();
	Thread.sleep(2000);
	
	//charge history
	con.view();
	Thread.sleep(2000);
	a.AndriodBack();
	Thread.sleep(2000);
	
	//Trips
	con.trips();
	Thread.sleep(2000);
	//reseting every trip data
	con.tripReset(con.TripReset1);
	con.resetButton();
	Thread.sleep(2000);
	con.tripReset(con.TripReset2);
	con.resetButton();
	Thread.sleep(2000);
	con.tripReset(con.TripReset3);
	con.resetButton();
	Thread.sleep(2000);
	
	//console
	con.console();
	Thread.sleep(2000);
	
	//changing theme and mode
	con.theme();
	Thread.sleep(2000);
	con.mode();
	
	//bluetooth
	
	for(int i=0;i<3;i++)
	{
		if(driver.getPageSource().contains("DISCONNECTED"))
		{
			con.bluetoothButton();
			Thread.sleep(10000);
		}
		else{
			break;
		}
	}
	
	//remove devices if there is any
	for(int i=0;i<5;i++)
	{
		if(driver.getPageSource().contains("Remove"))
		{
		con.removeConnectedDevice();
		}
		else{
			break;
		}
	}
}
}
 