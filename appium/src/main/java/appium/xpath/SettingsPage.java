package appium.xpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import actionClass.Actions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SettingsPage extends Actions {

		//Presetup
		AndroidDriver driver;
		public SettingsPage(AndroidDriver driver)
		{
			super(driver);
			this.driver=driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	
	//xpaths
		
		@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]")
		private WebElement Settings;
		
		@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Profile\"]/following-sibling::android.view.View[2]")
		private WebElement PersonalInfo;
		
		@AndroidFindBy(accessibility = "Documents")
		private WebElement Documents;
		
		@AndroidFindBy(accessibility = "DRIVING LICENSE")
		public WebElement DrivingLicense;
		
		@AndroidFindBy(accessibility = "REGISTRATION")
		public WebElement Registration;
		
		@AndroidFindBy(accessibility = "INSURANCE")
		public WebElement Insurance;
		
		@AndroidFindBy(accessibility = "Open Gallery")
		private WebElement OpenGallery;
		
		@AndroidFindBy(accessibility = "Open Camera")
		private WebElement OpenCamera;
		
		@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[1]")
		private WebElement selectPhoto;
		
		@AndroidFindBy(accessibility = "Crop")
		private WebElement TickMark;
		
		@AndroidFindBy(accessibility = "Vehicle Info")
		private WebElement VehicleInfo;
		
		@AndroidFindBy(accessibility = "VEHICLE")
		private WebElement Vehicle;
		
		@AndroidFindBy(accessibility = "SOFTWARE")
		private WebElement Software;
		
		@AndroidFindBy(accessibility = "WARRANTY")
		private WebElement Warranty;
		
		@AndroidFindBy(accessibility = "Violette")
		private WebElement Violette;
		
		@AndroidFindBy(accessibility = "Update")
		private WebElement Update;
		
		@AndroidFindBy(accessibility = "Proceed")
		private WebElement Proceed;
		
		@AndroidFindBy(accessibility = "Cancel Update")
		private WebElement CancelUpdate;
		
		@AndroidFindBy(accessibility = "Go Back")
		private WebElement GoBack;
		
		@AndroidFindBy(accessibility = "Logout")
		private WebElement Logout;
		
		@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"VIOLETTE\"]/following-sibling::android.view.View[1]")
		private WebElement CrashAlert;
		
		@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.android.permissioncontroller:id/content_container\"]/android.widget.LinearLayout")
		private WebElement allow;
		
		@AndroidFindBy(accessibility = "Update Contact")
		private WebElement UpdateContact;
		
		@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.samsung.android.app.contacts:id/contact_list_text_area\"]")
		private WebElement SelectContact;
		
		@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"VIOLETTE\"]/following-sibling::android.view.View[2]")
		private WebElement ACWs;
		
		@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"VIOLETTE\"]/following-sibling::android.view.View[3]")
		private WebElement Deltawatch;
		
		@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"A.C.W.S\"]/following-sibling::android.view.View[1]/android.view.View[1]")
		private WebElement DeltawatchIndication;
		
		@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"A.C.W.S\"]/following-sibling::android.view.View[1]/android.view.View[2]")
		private WebElement MotorarmedWarning;
		
		@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"DELTA WATCH\"]/following-sibling::android.view.View[1]/android.view.View[1]")
		private WebElement Movementalert;
		
		@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"DELTA WATCH\"]/following-sibling::android.view.View[1]/android.view.View[2]")
		private WebElement Fallalert;
		
		@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"DELTA WATCH\"]/following-sibling::android.view.View[1]/android.view.View[3]")
		private WebElement Towalert;
		
		//METHODS
		
		public void settings() {
			Settings.click();
		}
		
		public void personalInfo() {
			PersonalInfo.click();
		}
		
		public void documents() {
			Documents.click();
		}
		
		public void AddDocument(WebElement ele) throws InterruptedException {
			ele.click();
			Thread.sleep(1000);
			OpenGallery.click();
			Thread.sleep(1000);
			selectPhoto.click();
			Thread.sleep(1000);
			TickMark.click();
		}
		
		public void vehicleInfo() throws InterruptedException {
			VehicleInfo.click();
			Thread.sleep(2000);
			Software.click();
			Thread.sleep(2000);
			Warranty.click();
		}
		
		public void violette() {
			Violette.click();
		}
		
		public void update() throws InterruptedException {
			Update.click();
			Thread.sleep(2000);
			Proceed.click();
			Thread.sleep(2000);
			CancelUpdate.click();
			GoBack.click();
		}
		
		public void logout() {
			Logout.click();
		}
		
		public void crashAlert() throws InterruptedException {
			CrashAlert.click();
		}
		public void Allow() {
			allow.click();
		}
		
		public void updateConatct() throws InterruptedException {
			UpdateContact.click();
			Thread.sleep(2000);
			SelectContact.click();
		}
	
		public void ACWS() {
			ACWs.click();
		}
		
		public void DeltaWatchIndication() {
			DeltawatchIndication.click();
		}
		
		public void MotorArmedWarning() {
			MotorarmedWarning.click();
		}
		 public void DeltaWatch() {
			 Deltawatch.click();
		 }
		 
		 public void MovementAlert() {
			 Movementalert.click();
		 }
		 
		 public void FallAlert() {
			 Fallalert.click();
		 }
		 
		 public void TowAlert() {
			 Towalert.click();
		 }
}
