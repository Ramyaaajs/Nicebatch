package Assertion_inTESTNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fb_task 
{
	@Test
	public void pass() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.navigate().to("https://www.facebook.com/");
	 WebElement usn = driver.findElement(By.xpath("//input[@type='text'])"));
			usn.sendKeys("ramya");
			Thread.sleep(2000);
	driver.navigate().refresh();

	usn.sendKeys("ramya");	}
	
}
