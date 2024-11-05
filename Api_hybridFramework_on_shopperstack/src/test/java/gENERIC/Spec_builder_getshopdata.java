package gENERIC;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Spec_builder_getshopdata 
{
@BeforeMethod
public RequestSpecification request(String url,String content)
{
	RequestSpecBuilder rq=new RequestSpecBuilder();
	RequestSpecification req = rq.setBaseUri(url).setContentType(content).build();
	return req;
}
@AfterMethod
public ResponseSpecification response(int code,String content)
{
	ResponseSpecBuilder rs=new ResponseSpecBuilder();
	ResponseSpecification res = rs.expectStatusCode(code).expectContentType(content).build();
	return res;
}
}
