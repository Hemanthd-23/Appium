package appium.xpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import actionClass.Actions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NavigatePage extends Actions{

	//Presetup
	AndroidDriver driver;
	public NavigatePage(AndroidDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//xpaths
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View")
	public WebElement homePage;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Search\"]")
	private WebElement Search;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Add More\"]")
	private WebElement AddMore;
	

	@AndroidFindBy(xpath = "//android.widget.EditText")
	private WebElement SearchLoc;
	
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.View/android.view.View/android.view.View/android.view.View")
	private WebElement clickLocation;
	
	// methods
	
	public void search() {
		Search.click();
	}
	
	public void addMore() {
		AddMore.click();
	}
	
	public void searchLocation(String Loc) throws InterruptedException {
		SearchLoc.click();
		SearchLoc.sendKeys(Loc);
		Thread.sleep(2000);
		clickLocation.click();
	}
	
	public void AddFav(String Loc) throws InterruptedException {
		SearchLoc.click();
		SearchLoc.sendKeys(Loc);
		Thread.sleep(2000);
		clickLocation.click();
	}
	
}
