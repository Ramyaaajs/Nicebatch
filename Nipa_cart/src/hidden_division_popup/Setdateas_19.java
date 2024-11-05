package hidden_division_popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setdateas_19 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.get("https://www.redbus.in/");
	   driver.findElement(By.xpath("//span[text()='Date']")).click();
	   driver.findElement(By.xpath("//span[text()='19']")).click();
	}
}
