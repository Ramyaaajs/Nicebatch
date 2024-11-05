package hidden_division_popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoapp 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
	  // driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	   Thread.sleep(2000);
	  driver.findElement(By.xpath("//section[text()='Popups']")).click();
	   Thread.sleep(2000);
	 // driver.findElement(By.xpath("//section[text()='Hidden division']")).click();
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ramya");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ramya@gmail.com");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

}
