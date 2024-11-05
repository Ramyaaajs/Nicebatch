package Generic_scriptinTESTNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runnerscript extends For_closeADopen
{
@Test
public void runscript()
{
	driver.findElement(By.id("email")).sendKeys("ramya");
	driver.findElement(By.id("pass")).sendKeys("js");
	driver.findElement(By.name("login")).click();
}
}
