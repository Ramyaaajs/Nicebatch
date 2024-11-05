package dataPROVIDER;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprov 
{
@Test(dataProvider="createdata")
public void test1(String un,String pwd) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
}
@DataProvider(name = "createdata")
public Object[][] createData1() {
 return new Object[][] {
   { "appa", "data1" },
   { "Amma", "data2"},
 };
}
}

