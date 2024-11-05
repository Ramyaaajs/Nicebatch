package pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomforDataProvider 
{
	@FindBy(xpath="//input[@id='name']")
	private WebElement name;
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	@FindBy(xpath="//input[@id='password']")
	private WebElement pwd;
	@FindBy(xpath="//input[@id='mobile']")
	private WebElement mbno;
	public PomforDataProvider (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void username(String u)
	{
		name.sendKeys(u);		
	}
	public void email(String e)
	{
		email.sendKeys(e);		
	}
	public void password(String p)
	{
		pwd.sendKeys(p);	
	}
	public void mobile(String m)
	{
		mbno.sendKeys(m);		
	}
}
