package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.xpath("//a[contains(text(),'ಕನ್ನಡ')]")).click();
	driver.quit();
}
}
