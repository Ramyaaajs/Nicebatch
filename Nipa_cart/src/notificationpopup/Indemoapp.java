package notificationpopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Indemoapp 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeOptions cs=new ChromeOptions();
		cs.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(cs);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
	   WebElement ele = driver.findElement(By.id("browNotButton"));
	   ele.click();

	}

}
