package Uv.appium;

import org.testng.annotations.Test;

import actionClass.Actions;
import appium.xpath.ContorlsPage;

public class Sample_test_case extends Basetest {

	@Test(groups = {"Test"})
	public void test() {
		ContorlsPage con=new ContorlsPage(driver);
		Actions a=new Actions(driver);
		
		con.view();
		
	}
}
