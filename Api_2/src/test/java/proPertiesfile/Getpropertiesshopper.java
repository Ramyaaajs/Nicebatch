package proPertiesfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Getpropertiesshopper 
{
	@Test
	public static String  Getpropertiesshopper(String X) throws IOException
	{
	FileInputStream fis=new FileInputStream("./Property file/data.properties");
	Properties p=new Properties();
	p.load(fis);
	String val = p.getProperty(X);
	return val;
	}
}
