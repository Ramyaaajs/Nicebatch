package fileupload_popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.get("file:///C:/Users/Lenovo/Documents/selenium/Fileuploadpopup.html");
	 WebElement ele = driver.findElement(By.name("upload file"));
	 ele.sendKeys("C:\\Users\\Lenovo\\Pictures\\Saved Pictures");

	}

}
