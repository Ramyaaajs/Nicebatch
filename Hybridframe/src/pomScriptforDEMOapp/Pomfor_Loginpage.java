package pomScriptforDEMOapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomfor_Loginpage 
{
	@FindBy(name="username")
	private WebElement uName;
	@FindBy(name="password")
	private WebElement pwd;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btn;
	public Pomfor_Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void userid(String un)
	{
		uName.sendKeys(un);
	}
	public void userpwd(String pd)
	{
		pwd.sendKeys(pd);
	}
	public void loginbtn()
	{
		btn.click();
	}
}
