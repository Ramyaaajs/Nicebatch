package spec_Builder;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Generi_script 
{
@BeforeMethod
public RequestSpecification request()
{
	RequestSpecBuilder req=new RequestSpecBuilder();
	RequestSpecification reqqq = req.setBaseUri("https://reqres.in/").
	setContentType(ContentType.JSON).
	build();
	return reqqq;
}
@BeforeMethod
public RequestSpecification request2(String bdy)
{
	RequestSpecBuilder req=new RequestSpecBuilder();
	RequestSpecification reqbdy = req.setBaseUri("https://reqres.in/").
	setContentType(ContentType.JSON).
	setBody(bdy).
	build();
	return reqbdy;
}
@AfterMethod
public ResponseSpecification response()
{
	ResponseSpecBuilder res=new ResponseSpecBuilder();
	ResponseSpecification resp = res.expectStatusCode(200).
	expectStatusLine("HTTP/1.1 200 OK").
	expectContentType(ContentType.JSON).
	build();
	return resp;
}
}
