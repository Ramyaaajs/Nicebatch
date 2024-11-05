package Reporting_Tools;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Reporter 
{
public WebDriver driver;
@Test
public void exam()
{
	ExtentReports rep = new ExtentReports("./reports/nvn.html",false);
	ExtentTest test = rep.startTest("Fcaebook test exec");

}
}
