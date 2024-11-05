package shopperusingGERKIN;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_findshopperadata
{
@Test
public void get()
{
	Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").auth().oauth2("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJya2tteWExMjNvQGdtYWlsLmNvbSBTSE9QUEVSIiwiZXhwIjoxNzI3OTY1MzEyLCJpYXQiOjE3Mjc5MjkzMTJ9.0vgHWfDTPi5eBHjw5StKiCS7kpg45fx1cdcn4WR3JCk").
	when().get("/shoppers/145942").then().assertThat().statusCode(200).extract().response();
	System.out.println(res.asPrettyString());
}
}
