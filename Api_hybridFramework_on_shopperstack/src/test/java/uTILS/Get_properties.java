package uTILS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

public class Get_properties 
{
	FileInputStream fis;
@Test
public String get(String key)
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
     try 
     {
		p.load(fis);
	 } 
     catch (IOException e) 
     {
		e.printStackTrace();
	 }
      String k = p.getProperty(key);
      return k;
}
	
	
}
