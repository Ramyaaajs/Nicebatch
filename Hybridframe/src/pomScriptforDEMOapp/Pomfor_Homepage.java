package pomScriptforDEMOapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomfor_Homepage 
{
@FindBy(xpath="//span[.='PIM']")
private WebElement pim;
@FindBy(xpath="//a[text()='Add Employee']")
private WebElement addemp;
@FindBy(name="firstName")
private WebElement FName;
@FindBy(name="lastName")
private WebElement lastnm;
@FindBy(xpath="//button[@type='submit']")
private WebElement save;
public Pomfor_Homepage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void pimbtn()
{
	pim.click();
}
public void Addempl()
{
	addemp.click();
}
public void firstnme(String fn)
{
	FName.sendKeys(fn);//Ramya
}
public void lastnme(String ln)
{
	lastnm.sendKeys(ln);//js
}
public void savebtn()
{
	save.click();
}
}

