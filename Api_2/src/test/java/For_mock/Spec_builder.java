package For_mock;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Spec_builder 
{
@BeforeMethod
public RequestSpecification request()
{
	RequestSpecBuilder req=new RequestSpecBuilder();
	RequestSpecification reqp=req.setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
return reqp;
}
@AfterMethod
public ResponseSpecification response()
{
	ResponseSpecBuilder res=new ResponseSpecBuilder();
	ResponseSpecification resp = res.expectStatusCode(200).expectContentType(ContentType.JSON).build();
	return resp;
}
}
