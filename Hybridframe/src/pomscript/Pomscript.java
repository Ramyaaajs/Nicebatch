package pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomscript 
{
	@FindBy(id="email")
	private WebElement uName;
	@FindBy(name="pass")
	private WebElement pName;
	@FindBy(name="login")
	private WebElement btn;
	public Pomscript(WebDriver driver)
	{
		PageFactory.initElements(driver,this);//last one we have to take (webdriver driver,object)
	}
	public void passdata(String un)
	{
		uName.sendKeys(un);
	}
	public void passdata1(String pwd)
	{
		pName.sendKeys(pwd);
	}
	public void button()
	{
		btn.click();
	}
	}

