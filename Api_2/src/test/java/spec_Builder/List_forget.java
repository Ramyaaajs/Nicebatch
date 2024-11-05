package spec_Builder;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class List_forget 
{
@Test
public void get()
{
	Generi_script ge=new Generi_script();
	RequestSpecification req = ge.request();
	ResponseSpecification res = ge.response();
   Response resp = RestAssured.given().spec(req).when().get("/api/users/2").then().spec(res).extract().response();
   System.out.println(resp.asPrettyString());
}
}
