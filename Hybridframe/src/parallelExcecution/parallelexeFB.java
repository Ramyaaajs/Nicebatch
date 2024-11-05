package parallelExcecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelexeFB 
{
	public WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void textexec(String browser1)
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	//System.setProperty("webdriver.edge.driver","./Software/msedgedriver.exe");
//	if(browser1.equals("microsoftedge"))
//	{
	driver=new EdgeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.name("email")).sendKeys("ramya");
//		driver.findElement(By.name("pass")).sendKeys("ramya@2001");
//		driver.findElement(By.name("login")).click();
		driver.quit();
//	}
//	else
//	{
//		driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.name("email")).sendKeys("ramya");
//		driver.findElement(By.name("pass")).sendKeys("ramya@2001");
//		driver.findElement(By.name("login")).click();
//	}
}
}

