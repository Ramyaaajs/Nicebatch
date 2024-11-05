package runnerscript;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Genericscriptphotus.Genericphoto;
import genericscript.GenericFLIPKART;
import pomscript.Flippomscrpt;

public class Fliprunner extends GenericFLIPKART
{
	@Test
	public void sceno1() throws InterruptedException, IOException
	{
	Flippomscrpt f=new Flippomscrpt(driver);
	f.passdata("phone");
	Thread.sleep(2000);
	f.passdata1();
	Thread.sleep(2000);
	//f.scroll();
	Thread.sleep(3000);
	WebElement phne=driver.findElement(By.xpath("//div[/text()='Apple iPhone 15 (Black, 128 GB)']"));
	Point loc = phne.getLocation();
	System.out.println(loc.getX());
	System.out.println(loc.getX());
	JavascriptExecutor js=(JavascriptExecutor)driver;
	// int y=f.scroll();
     int z=f.scroll2();
	js.executeScript("window.scrollBy("+0+","+z+")");
	Thread.sleep(3000);
	f.phnclick();
	Thread.sleep(3000);
	Set<String> allwh= driver.getWindowHandles();
	ArrayList<String>A=new ArrayList(allwh);
	String v = A.get(1);
	driver.switchTo().window(v);
	Thread.sleep(2000);
	//f.iphone();
	f.buynow();
	Thread.sleep(2000);
	Genericphoto.getphoto(driver);
	}
}
