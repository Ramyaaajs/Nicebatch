package proPertiesfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Get_properties 
{
@Test
public static String Getdata() throws IOException
{
	FileInputStream fis=new FileInputStream("./Property file/data.properties");
	Properties p=new Properties();
	p.load(fis);
	String url = p.getProperty("baseurl");
	return url;
	
}
}
