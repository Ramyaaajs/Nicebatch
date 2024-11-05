package emptybrowser;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Emptychrome
{
	public WebDriver driver;
@Test
public void log()
{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.get("https://www.facebook.com");

}
}
