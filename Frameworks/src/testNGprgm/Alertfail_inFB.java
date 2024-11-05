package testNGprgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alertfail_inFB
{
	@Test()
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("poornima@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("like");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
		System.out.println("1st");
		//driver.quit();
    }
	@Test(dependsOnMethods="login")
	public void login2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("goornima@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("her");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
		System.out.println("2nd");
		Assert.fail();
		//driver.quit();
   }
	@Test(dependsOnMethods="login2")
	public void login3() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("moornima@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("much");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
		System.out.println("3rd");
		//driver.quit();
    }
}
