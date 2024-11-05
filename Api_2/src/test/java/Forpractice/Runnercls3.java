package Forpractice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Runnercls3 
{
@Test
public void get()
{
	Spec_builder sp=new Spec_builder();
	RequestSpecification req = sp.request();
	ResponseSpecification res = sp.response();
	Response res1 = RestAssured.given().spec(req).when().get("api/users?page=2").then().spec(res).extract().response();
	System.out.println(res1.asPrettyString());

}
}
