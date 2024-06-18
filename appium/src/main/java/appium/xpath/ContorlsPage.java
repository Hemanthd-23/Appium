package appium.xpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import actionClass.Actions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ContorlsPage extends Actions {
	AndroidDriver driver;
	public ContorlsPage(AndroidDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//xpaths
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View")
	public WebElement homePage;
	
	@AndroidFindBy(accessibility = "HILL HOLD")
	private WebElement HillHold;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"HILL HOLD\"]/following-sibling::android.widget.ImageView[1]")
	private WebElement ABS;
	
	@AndroidFindBy(accessibility = "TC")
	private WebElement TC;
	
	@AndroidFindBy(className = "android.widget.SeekBar")
	public WebElement regen;
	
	@AndroidFindBy(accessibility = "ENERGY")
	private WebElement Energy;
	
	@AndroidFindBy(accessibility = "View")
	private WebElement View;
	
	
	@AndroidFindBy(accessibility = "TRIPS")
	private WebElement Trips;
	
	@AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Reset\"])[1]")
	public WebElement TripReset1;
	
	@AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Reset\"])[2]")
	public WebElement TripReset2;
	
	@AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Reset\"])[3]")
	public WebElement TripReset3;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Reset\"]")
	private WebElement ResetButton;
	
	@AndroidFindBy(accessibility = "CONSOLE")
	private WebElement Console;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"PAIRED DEVICES\"]/../android.view.View[1]/android.view.View[1]")
	private WebElement Theme;
	
	@AndroidFindBy(xpath ="//android.view.View[@content-desc=\"PAIRED DEVICES\"]/../android.view.View[1]/android.view.View[2]")
	private WebElement Mode;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\\\"PAIRED DEVICES\\\"]/../android.view.View[5]")
	private WebElement BluetoothButton;
	
	@AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"Remove\"])[1]")
	private WebElement Removebutton;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Remove\"]")
	private WebElement removeConfirm;
	
	//methods
	
	public void hillHold() {
		HillHold.click();
	}
	
	public void abs() {
		ABS.click();
	}
	
	public void tc() {
		TC.click();
	}
	
	public void energy() {
		Energy.click();
	}
	
	public void view() {
		View.click();
	}
	
	public void trips() {
		Trips.click();
	}
	
	public void tripReset(WebElement trip ) {
		trip.click();
	}
	
	public void resetButton( ) {
		ResetButton.click();
	}
	
	public void console() {
		Console.click();
	}
	
	public void theme() {
		Theme.click();
	}
	
	public void mode() {
		Mode.click();
	}
	
	public void bluetoothButton() {
		BluetoothButton.click();
	}
	
	public void removeConnectedDevice() {
		Removebutton.click();
		removeConfirm.click();
	}
}
