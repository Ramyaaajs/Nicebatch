package genericscriptDEMO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pomScriptforDEMOapp.Pomfor_logout;

public class demogenericRahul 
{
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeapp() throws InterruptedException
	{
		Pomfor_logout p5=new Pomfor_logout (driver);
		p5.logoutbtn();
		Thread.sleep(3000);
	driver.close();	
	}
	}

