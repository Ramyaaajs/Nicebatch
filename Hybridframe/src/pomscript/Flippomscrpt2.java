package pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flippomscrpt2 
{
	@FindBy(xpath="//input[@placeholder='Search for Products, Brands and More']")
	private WebElement serch;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btn;
	@FindBy(xpath="//div[text()='OPPO K12x 5G with 45W SUPERVOOC Charger In-The-Box (Feather Pink, 128 GB)'and@class='KzDlHZ']")
    private WebElement phn;
	@FindBy(xpath="//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']")
	private WebElement bn;
	@FindBy(xpath="//button[@class='QqFHMw vslbG+ In9uk2']")
	private WebElement crt;
	public Flippomscrpt2(WebDriver driver)
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
   public void iphone()
	{
		phn.click();
	}
	public void buynow()
	{
		bn.click();
	}
	public void cart()
	{
		crt.click();
	}
}
