package dataPROVIDER;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderINSTA
{
	@Test(dataProvider="createdata")
	public void test1(String un,String pwd) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	}
	@DataProvider(name = "createdata")
	public Object[][] createData1() 
	{
	 return new Object[][] {
	   { "poorna", "data1" },
	   { "ramya", "data2"},
	   { "sowmya", "data3"},
	 };
	}
}
