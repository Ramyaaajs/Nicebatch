package Forpractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
	RequestSpecification reqbdy = req.setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
   return reqbdy;
}
@AfterMethod
public ResponseSpecification response()
{
ResponseSpecBuilder res=new ResponseSpecBuilder();
ResponseSpecification resbdy = res.expectStatusCode(200).expectContentType(ContentType.JSON).build();
return resbdy;
}
}