package runnerscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericscript.Genericscript;
//import Pom_script.pomgeneric;
import pomscript.Pomscript;

public class Usepom_nd_generic extends Genericscript
{
@Test
public void login() throws InterruptedException
{
	//System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	//WebDriver driver=new ChromeDriver(); dont use these three line bcz u already used this one
	//driver.get("https://www.facebook.com/");
	Pomscript p=new Pomscript(driver);
	Thread.sleep(2000);
	p.passdata("ramya@gmail.com");
	Thread.sleep(2000);
	p.passdata1("ramya123");
	Thread.sleep(2000);
	p.button();
	Thread.sleep(2000);
}
}
