package appium.xpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import actionClass.Actions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DiagnosticPage extends Actions {

	//Presetup
		AndroidDriver driver;
		public DiagnosticPage(AndroidDriver driver)
		{
			super(driver);
			this.driver=driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	
		//xpath
//		@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View")
//		public WebElement swipedUpPage;
		
		@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View")
		public WebElement homePage;
		
		@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Schedule Service\"]/../../android.widget.ImageView[1]")
		private WebElement TPMS; 
		
		@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Schedule Service\"]/../../android.view.View[4]")
		private WebElement Energy;
		
		@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"View\"]")
		private WebElement ChargeHistoryView;
		
		@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Schedule Service\"]")
		private WebElement ScheduleService;
		
		@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"REGULAR\"]")
		private WebElement RegularService;
		
		@AndroidFindBy(className = "android.widget.EditText")
		private WebElement FeedbackDescription;
		
		@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"SCHEDULE SERVICE\"]/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.view.View/android.view.View")
		private WebElement FeedbackPhoto;
		
		@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_check\"])[1]")
		private WebElement SelectingPhoto;
		
		@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.google.android.providers.media.module:id/button_add\"]")
		private WebElement AddPhoto;
		
		@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Submit\"]")
		public WebElement SubmitFeedback;
		
		@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"ISSUE\"]")
		private WebElement IssueService;
		
		@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"ACCIDENT\"]")
		private WebElement AccidentService;
		
		//methods
		public void tpms() {
			TPMS.click();
		}
		
		public void energy() {
			Energy.click();
		}
		
		public void chargeHistoryView() {
			ChargeHistoryView.click();
		}
		
		public void scheduleService() {
			ScheduleService.click();
		}
		
		public void regularService() {
			RegularService.click();
		}
		
		public void feedbackDescription() {
			FeedbackDescription.click();
			FeedbackDescription.sendKeys("Feedback for bikie");
		}
		
		public void feedbackPhoto() throws InterruptedException {
			FeedbackPhoto.click();
			Thread.sleep(2000);
			SelectingPhoto.click();
			Thread.sleep(2000);
			AddPhoto.click();
		}
		
		public void issueService() {
			IssueService.click();
		}
		
		public void accidentService() {
			AccidentService.click();
		}
}
