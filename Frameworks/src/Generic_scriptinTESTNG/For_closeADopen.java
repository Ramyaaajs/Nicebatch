package Generic_scriptinTESTNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class For_closeADopen 
{
public WebDriver driver;
@BeforeMethod
public void openapp()
{
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@AfterMethod
public void closeapp()
{
driver.close();	
}
}
