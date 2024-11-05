package gENERIC;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Spec_builder_post 
{
@BeforeMethod
public RequestSpecification request(String url,String body,String content)
{
	RequestSpecBuilder req1=new RequestSpecBuilder();
	RequestSpecification req = req1.setBaseUri(url).
	        setBody(body).
	        setContentType(content).build();
	return req;
}
@AfterMethod
public ResponseSpecification response(int code,String line,String content)
{
	ResponseSpecBuilder res1= new ResponseSpecBuilder();
	ResponseSpecification res = res1.expectStatusCode(code).
	expectStatusLine(line).expectContentType(content).build();
	return res;
}


}
