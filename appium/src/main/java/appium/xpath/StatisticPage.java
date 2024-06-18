package appium.xpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import actionClass.Actions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StatisticPage extends Actions{

	//Presetup
		AndroidDriver driver;
		public StatisticPage(AndroidDriver driver)
		{
			super(driver);
			this.driver=driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		
		//framework xpaths
		
		@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View")
		public WebElement homePage;
		
		@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"No available data\"]")
		public WebElement NodataAvailable;
		
		@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Mon')]/../../following-sibling::android.view.View[2]/android.widget.ImageView[1]")
		private WebElement Ridedata;
		
		@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Mon')]")
		private WebElement monday;
		
		@AndroidFindBy(xpath = "//android.widget.HorizontalScrollView")
		public WebElement WeekScrollbar;
		
		
		//methods
		public void rideData() {
			Ridedata.click();
		}
		
		public void ClickMonday() {
			monday.click();
		}
		
	
		
		
}
