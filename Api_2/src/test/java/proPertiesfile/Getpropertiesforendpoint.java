package proPertiesfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Getpropertiesforendpoint 
{
@Test
public static String getenfpoint() throws IOException
{
FileInputStream fis=new FileInputStream("./Property file/data.properties");
Properties p=new Properties();
p.load(fis);
String p1 = p.getProperty("endpoint");
return p1;
    
}
}
