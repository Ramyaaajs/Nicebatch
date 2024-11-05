package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Getproperties 
{
	public FileInputStream fis;
@Test
public String get(String key) throws IOException
{
	
	try 
	{
	fis=new FileInputStream("./Propertyfile/data.properties");
	} 
	catch (FileNotFoundException e)
	{
		e.printStackTrace();
	}
   Properties p=new Properties();
   p.load(fis);
  String x = p.getProperty(key);
  return x;
 }
}
