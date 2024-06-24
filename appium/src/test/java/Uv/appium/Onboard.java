package Uv.appium;

import org.testng.annotations.Test;

import actionClass.Actions;
import appium.xpath.OnboardingPage;

public class Onboard extends Basetest {
	
	@Test
public void Onboards() throws InterruptedException{
	
		//frame work test cases
	
	OnboardingPage onb=new OnboardingPage(driver);
	Actions a=new Actions(driver);
	Thread.sleep(2000);
	onb.clickGetstarted();
	onb.setPhoneNumber("8431411160");
	if(driver.getPageSource().contains("Please enter a valid phone number"))
		System.out.println("Phone no not verified");
	else
		System.out.println("Entered Phone no");
	onb.getOTP();
	Thread.sleep(15000);
	
	//otp resend
	if(!onb.isContinueEnable()) {
		System.out.println("Resending Otp");
		onb.Resend();
		Thread.sleep(15000);
		}
	Thread.sleep(2000);
	onb.getOTP();
	
	//swipe up
	a.SwipeActions(onb.onboardingSwipeUp,"up");
	Thread.sleep(2000);
	

	//Setting up
	for(int i=1;i<=4;i++) 
	{
	onb.nextClick();
	}
	
	Thread.sleep(2000);
	onb.finishClick();
	Thread.sleep(2000);
	
	//permissions

	for(int i=1;i<=3;i++) 
	{
		onb.permissions();
	}	
}
}
/*capturing colour of otp box
try {
	System.out.println(driver.findElement(By.xpath("//android.widget.EditText")).getCssValue("background-color"));
	}
	catch(UnsupportedCommandException e)
	{
		System.out.println("Could not check colour of otp box");
		File otp=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(otp,new File("C:\\Users\\Hemanth D\\OneDrive - Ultraviolette Automotive Private Limited\\Desktop\\SS\\otp.jpg"));
	}*/