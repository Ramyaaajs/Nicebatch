package generic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Spec_builder 
{
@BeforeMethod
public RequestSpecification request(String url)
{
RequestSpecBuilder reqsb=new RequestSpecBuilder();
RequestSpecification urll = reqsb.setBaseUri(url).setContentType(ContentType.JSON).build();
return urll;
}
@AfterMethod
private ResponseSpecification response(int code,String line)
{
 ResponseSpecBuilder ressb=new ResponseSpecBuilder();
 ResponseSpecification var = ressb.expectStatusCode(code).expectStatusLine(line).expectContentType(ContentType.JSON).build();
return var;
}

}
