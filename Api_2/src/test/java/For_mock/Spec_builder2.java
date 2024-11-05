package For_mock;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Spec_builder2 
{
@BeforeMethod
public RequestSpecification request()
{
	RequestSpecBuilder rs=new RequestSpecBuilder();
	 RequestSpecification req = rs.setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
    return req;
}
@AfterMethod
public ResponseSpecification response()
{
	ResponseSpecBuilder resp=new ResponseSpecBuilder();
	ResponseSpecification res = resp.expectStatusCode(200).expectContentType(ContentType.JSON).build();
	return res;
}
}
