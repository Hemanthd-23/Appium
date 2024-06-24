package appium.xpath;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import actionClass.Actions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AssistPage extends Actions {

	//Presetup
	AndroidDriver driver;
	public AssistPage(AndroidDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	//xpaths
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[4]")
	private WebElement Assist;
	
	@AndroidFindBy(accessibility = "Feedback")
	private WebElement Feedback;
	
	@AndroidFindBy(accessibility = "User Manual")
	private WebElement UserManual;
	
	@AndroidFindBy(accessibility = "Lockdown")
	private WebElement Lockdown;
	
	@AndroidFindBy(accessibility = "Roadside Assist")
	private WebElement RoadsideAssist;

	@AndroidFindBy(accessibility = "FAQ")
	private WebElement faq;

	@AndroidFindBy(accessibility = "Contact Us")
	private WebElement ContactUs;
	
	@AndroidFindBy(xpath = "//android.widget.EditText")
	private WebElement FeedbackDescription;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Feedback\"]/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.view.View/android.view.View")
	private WebElement Photo;
	
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[1]")
	private WebElement SelectPhoto;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.google.android.providers.media.module:id/button_add\"]")
	private WebElement AddPhoto;
	
	@AndroidFindBy(accessibility = "Report Issue")
	public WebElement ReportIssue;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button")
	private WebElement Search;
	
	@AndroidFindBy(xpath = "//android.widget.EditText")
	private WebElement find;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Lock My F77\"]")
	private WebElement LockMyF77;
	
	@AndroidFindBy(accessibility = "Continue")
	private WebElement Continue;
	
	@AndroidFindBy(accessibility = "Unlock my F77")
	private WebElement UnlockmyF77;
	
	
	//methods
	
	public void assist() {
		Assist.click();
	}
	
	public void feedback() {
		Feedback.click();
	}
	
	public void GiveFeedback() throws InterruptedException {
		FeedbackDescription.click();
		FeedbackDescription.sendKeys("Feedback for F77");
		AndriodBack();
		Thread.sleep(2000);
		Photo.click();
		Thread.sleep(2000);
		SelectPhoto.click();
		Thread.sleep(2000);
		AddPhoto.click();
	}
	
	public void userManual() {
		UserManual.click();
	}
	
	public void search() throws InterruptedException {
		Search.click();
		Thread.sleep(2000);
		find.sendKeys("55");
		find.sendKeys(Keys.ENTER);
	}
	
	public void lockdown() {
		Lockdown.click();
	}
	
	public void lockMyF77() throws InterruptedException {
		LockMyF77.click();
		Thread.sleep(15000);
		Continue.click();
	}
	
	public void unlockMyF77() throws InterruptedException {
		UnlockmyF77.click();
		Thread.sleep(15000);
		Continue.click();
	}
	
	public void roadSideAssist() {
		RoadsideAssist.click();
	}
	
	public void FAQ() {
		faq.click();
	}
	 public void contactUs() {
		 ContactUs.click();
	 }
	
}
