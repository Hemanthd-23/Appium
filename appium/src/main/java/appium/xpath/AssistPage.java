package appium.xpath;

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
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]")
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
	private WebElement FAQ;

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
}
