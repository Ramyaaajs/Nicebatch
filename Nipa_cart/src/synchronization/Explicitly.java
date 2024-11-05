package synchronization;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitly {

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.facebook.com/");
   String title = driver.getTitle();
   //System.out.println(title);
  WebElement email = driver.findElement(By.name("email"));
   WebDriverWait wait = new WebDriverWait(driver,10);
   wait.until(ExpectedConditions.titleContains(title));
   email.sendKeys("ramya");
  String url = driver.getCurrentUrl();
  wait.until(ExpectedConditions.urlContains(url));
 // Boolean res = wait.until(ExpectedConditions.urlContains(url));
 // System.out.println(res);
   wait.until(ExpectedConditions.visibilityOf(email));
   email.sendKeys("sowmya");
   driver.quit();
   

	}

}
