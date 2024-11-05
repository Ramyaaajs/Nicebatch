package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class emptybrowser 
{
	@Test
	public void log()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		System.out.println("hi");
		
		
	}
}
