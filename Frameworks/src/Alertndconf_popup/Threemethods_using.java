package Alertndconf_popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Threemethods_using 
{
	public static void Default() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		a.accept();
	}
	public static void Confirms() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		a.accept();
	}
	public static void Promt() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		a.sendKeys("yes");
		a.accept();
	}
	public static void main(String[] args) throws InterruptedException
	{
		Default();
		Confirms();
		Promt();
	}

}
