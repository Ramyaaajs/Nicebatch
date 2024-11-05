package Pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class pomgeneric 
{
@FindBy(id="email")
private WebElement uName;
public pomgeneric(WebDriver driver)
{
	PageFactory.initElements(driver,this);//last one we have to take (webdriver driver,object)
}
public void passdata(String un)
{
	uName.sendKeys(un);
}
}
