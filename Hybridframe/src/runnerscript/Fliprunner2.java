package runnerscript;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.testng.annotations.Test;

import Genericscriptphotus.Genericphoto;
import genericscript.GenericFLIPKART;
import pomscript.Flippomscrpt;
import pomscript.Flippomscrpt2;
	public class Fliprunner2 extends GenericFLIPKART
	{
		@Test
		public void sceno1() throws InterruptedException, IOException
		{
		Flippomscrpt2 f=new Flippomscrpt2(driver);
		f.passdata("phone");
		Thread.sleep(2000);
		f.passdata1();
		Thread.sleep(2000);
		f.iphone();
		Thread.sleep(3000);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy("+x+","+y+")");
		Set<String> allwh= driver.getWindowHandles();
		ArrayList<String>A=new ArrayList(allwh);
		String v = A.get(1);
		driver.switchTo().window(v);
		Thread.sleep(2000);
		//f.iphone();
		Thread.sleep(2000);
		f.buynow();
		Thread.sleep(2000);
		Genericphoto.getphoto(driver);
		}
		@Test
		public void sceno2() throws InterruptedException, IOException
		{
		Flippomscrpt2 f=new Flippomscrpt2(driver);
		f.passdata("phone");
		Thread.sleep(2000);
		f.passdata1();
		Thread.sleep(2000);
		f.iphone();
		Thread.sleep(3000);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy("+x+","+y+")");
		Set<String> allwh= driver.getWindowHandles();
		ArrayList<String>A=new ArrayList(allwh);
		String v = A.get(1);
		driver.switchTo().window(v);
		Thread.sleep(2000);
		//f.iphone();
		Thread.sleep(2000);
		f.cart();
		Thread.sleep(2000);
		Genericphoto.getphoto(driver);
		}
	}

