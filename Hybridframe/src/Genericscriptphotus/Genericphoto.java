package Genericscriptphotus;

import java.io.File;
import java.io.IOException;
import java.util.Date;
//import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Genericphoto 
{
	public static void getphoto(WebDriver driver) throws IOException
	{
    String photo="./photus/";
    Date d=new Date();
    String d1 = d.toString();
    String d2 = d1.replace(":","-");
    TakesScreenshot ts= (TakesScreenshot )driver;
    File src=ts.getScreenshotAs(OutputType.FILE);
    File dst=new File(photo+d2+".jpeg");
    FileHandler.copy(src,dst); 		
	}
}
