package pomScriptforDEMOapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomfor_logout 
{
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
	private WebElement drpdn;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement lgout;
	public Pomfor_logout(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void dropdown()
	{
		drpdn.click();
	}
	public void logoutbtn()
	{
		lgout.click();
	}
	
}
