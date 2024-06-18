package appium.xpath;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

import actionClass.Actions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OnboardingPage extends Actions {
	
	//Presetup
	AndroidDriver driver;
	public OnboardingPage(AndroidDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//framework xpaths
	@AndroidFindBy(accessibility  ="Get Started")
	private WebElement GetStarted;
	
	@AndroidFindBy(xpath = "//android.widget.EditText")
	private WebElement phoneNumber;
	
	@AndroidFindBy(accessibility = "Continue")
	private WebElement getOtpContinue;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Continue\"]")
	private WebElement continueButton;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Resend\"]")
	private WebElement resend;

	@AndroidFindBy(xpath = "//android.widget.ScrollView")
	public WebElement onboardingSwipeUp;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"NEXT\"]")
	private WebElement nextButton;
		
	@AndroidFindBy(accessibility ="FINISH" )
	private WebElement finishButton;
	
	@AndroidFindBy(className = "android.widget.Button")
	private WebElement allowPermission;

	//methods
	public void clickGetstarted()
	{
		GetStarted.click();
	}
	
	public void setPhoneNumber(String no)
	{
		phoneNumber.click();
		phoneNumber.sendKeys(no);
	}
	
	public void getOTP()
	{
		getOtpContinue.click();
	}
	
	public boolean isContinueEnable() {
		return continueButton.isEnabled();
	}
	
	public void Resend() {
		resend.click();
	}
	
	public void nextClick() throws InterruptedException {
		Thread.sleep(2000);
		nextButton.click();
	}
	
	public void finishClick() throws InterruptedException {
		finishButton.click();
		Thread.sleep(2000);
	}
	
	public void permissions() {
		allowPermission.click();
	}
	
	//"+varibale+" usefull in actions class
}

