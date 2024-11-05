package pOJO;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Runnerclass
{
@Test
public void get()
{
//Response res = RestAssured.given().baseUri("https://reqres.in").when().get("/api/users/2").then().assertThat()
//.statusCode(200).extract().response();
//Single_user body = res.as(Single_user.class);
//Data d = body.getData();
//String fn = d.getFirst_name();
//System.out.println(fn);
Response res = RestAssured.given().baseUri("https://reqres.in").when().get("/api/users/2").then().assertThat().statusCode(200).extract().response();
Single_user body = res.as(Single_user.class);
Data data = body.getData();
String fn = data.getFirst_name();
System.out.println(fn);

}
}
