package Uv.appium;

import org.testng.annotations.Test;

import appium.xpath.ContorlsPage;

public class Sample_test_case extends Basetest {

	@Test(groups = {"Test"})
	public void test() throws InterruptedException {
		ContorlsPage con=new ContorlsPage(driver);
		con.bluetoothButton();
	}
}
