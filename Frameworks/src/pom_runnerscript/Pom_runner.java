package pom_runnerscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom_script.pomgeneric;

public class Pom_runner 
{
@Test
public void logincheck() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	 pomgeneric p=new pomgeneric(driver);
	 p.passdata("ramya");
	 Thread.sleep(2000);
	 driver.navigate().refresh();
	 Thread.sleep(2000);
	 p.passdata("ramya");
	
}

}
