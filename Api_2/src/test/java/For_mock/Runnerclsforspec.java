package For_mock;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Runnerclsforspec
{
@Test
public void get()
{
Spec_builder2 s=new Spec_builder2();
RequestSpecification req = s.request();
ResponseSpecification res = s.response();
Response res11 = RestAssured.given().spec(req).when().get("/api/users?page=2").then().spec(res).extract().response();
System.out.println(res11.asPrettyString());
}
}
