package Uv.appium;

import org.testng.annotations.Test;

import actionClass.Actions;
import appium.xpath.StatisticPage;

public class Statistics extends Basetest {
@Test

public void Stats() throws InterruptedException
{
	StatisticPage stat=new StatisticPage(driver);
	Actions a=new Actions(driver);
	for(int i=0;i<2;i++) {
	a.SwipeActions(stat.homePage,"right");
	Thread.sleep(2000);
	}
	a.SwipeActions(stat.homePage,"up");
	Thread.sleep(2000);
	
	//scroll up 
	stat.ClickMonday();
	a.SwipeActions(stat.WeekScrollbar,"up");
	Thread.sleep(2000);
	if(stat.NodataAvailable.isDisplayed())
	{
		
	}
	else {
		stat.rideData();
	 }
	a.DragActions(stat.WeekScrollbar, 931, 1586);
	
}
}
