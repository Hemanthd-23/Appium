package Uv.appium;

import org.testng.annotations.Test;

import actionClass.Actions;
import appium.xpath.NavigatePage;

public class Navigate extends Basetest {

	@Test
	public void navigation() throws InterruptedException {
		NavigatePage nav=new NavigatePage(driver);
		Actions a=new Actions(driver);
		
		a.SwipeActions(nav.homePage,"right");
		Thread.sleep(2000);
		a.SwipeActions(nav.homePage,"up");
		Thread.sleep(2000);
		nav.search();
		Thread.sleep(2000);
		nav.searchLocation("Rajajinagar");
		Thread.sleep(2000);
		for(int i=0;i<2;i++) {
		a.AndriodBack();
		}
		Thread.sleep(2000);
		nav.addMore();
		Thread.sleep(2000);
		for(int i=0;i<2;i++) {
		a.AndriodBack();
		}
	}
}
