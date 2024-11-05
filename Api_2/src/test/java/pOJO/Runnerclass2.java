package pOJO;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Runnerclass2 
{
@Test
public void get()
{
Response res = RestAssured.given().baseUri("https://reqres.in/").when().get("/api/users/2").then().assertThat().extract().response();	
Single_user2 body = res.as(Single_user2.class);
Data2 data = body.getData();
String fn = data.getLast_name();
System.out.println(fn);

}
}
