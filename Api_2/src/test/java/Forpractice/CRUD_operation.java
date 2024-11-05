package Forpractice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CRUD_operation 
{
@Test
public void post()
{
	RestAssured.baseURI="https://reqres.in";
	RequestSpecification bodyy = RestAssured.given();
	JSONObject obj=new JSONObject();
	obj.put("email","eve.holt@reqres.in");
	obj.put("password","pistol");
    bodyy.contentType(ContentType.JSON);
    bodyy.body(obj.toJSONString());
    Response res = bodyy.request(Method.POST,"/api/register");
    System.out.println(res.statusCode());
    System.out.println(res.asPrettyString());
}
@Test
public void Get()
{
	RestAssured.baseURI="https://reqres.in";
	RequestSpecification bodyy = RestAssured.given();
	bodyy.request(Method.GET,"")

}
}
