package pomscript;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flippomscrpt 
{
	@FindBy(xpath="//input[@placeholder='Search for Products, Brands and More']")
	private WebElement serch;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btn;
	@FindBy(xpath="//div[text()='Apple iPhone 15 (Black, 128 GB)']")
	private WebElement phn;
	@FindBy(xpath="//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']")
	private WebElement bn;
	public Flippomscrpt(WebDriver driver)
	{
		PageFactory.initElements(driver,this);//last one we have to take (webdriver driver,object)
	}
	public void passdata(String ph)
	{
		serch.sendKeys(ph);
	}
	public void passdata1()
	{
		btn.click();
	}
//	public int scroll()
//	{
//		Point loc = phn.getLocation();
//		int x = loc.getX();
//		return x;
//	}
	public int scroll2()
	{
		Point loc = phn.getLocation();
		int y = loc.getY();
		return y;
	}
	public void phnclick()
	{
		phn.click();
	}
//   public void iphone()
//	{
//		phn.click();
//	}
	public void buynow()
	{
		bn.click();
	}
	}

