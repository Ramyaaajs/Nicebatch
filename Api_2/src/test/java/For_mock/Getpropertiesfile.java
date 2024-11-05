package For_mock;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Getpropertiesfile 
{
@Test
public static String get() throws IOException
{
	FileInputStream fis=new FileInputStream("./Property file/data.properties");
	Properties p=new Properties();
	p.load(fis);
    String baseurl = p.getProperty("baseurlreq");
    return baseurl;
}
@Test
public static String get1() throws IOException
{
	FileInputStream fis=new FileInputStream("./Property file/data.properties");
	Properties p=new Properties();
	p.load(fis);
	String endpt = p.getProperty("endpointreq");
return endpt;
}
}
