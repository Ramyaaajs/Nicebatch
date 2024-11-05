package pomscript;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomscriptAMAZON 
{
	@FindBy(xpath="//input[@placeholder='Search Amazon.in']")
	private WebElement serch;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement btn;
	@FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
	private WebElement send;
	@FindBy(xpath="//input[@name='submit.add-to-cart']")
	private WebElement bn;
	public PomscriptAMAZON(WebDriver driver)
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
	public int scroll1()
	{
		Point loc = send.getLocation();
		int y = loc.getY();
		return y;
	}
	public void cart()
	{
		bn.click();
	}
}
