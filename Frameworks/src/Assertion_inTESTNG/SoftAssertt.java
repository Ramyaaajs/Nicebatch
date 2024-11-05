package Assertion_inTESTNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertt 
{
	@Test
	public void data()
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More')"));
		//driver.findElement(By.xpath("//span[test()='Electronics']")).click();
		//driver.findElement(By.xpath("//a[test()='All']")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//Assert.assertEquals(url,"https://www.flipkart.com/");//if its AR nd ER crct
		SoftAssert as=new SoftAssert();
		as.assertEquals(url,"https://www.flipkart");
		System.out.println("1");
		System.out.println("2");
		driver.quit();
	}
	@Test
	public void data1()
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More')"));
		//driver.findElement(By.xpath("//span[test()='Electronics']")).click();
		//driver.findElement(By.xpath("//a[test()='All']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(title,"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		//System.out.println("2");
		driver.quit();
	}
}
