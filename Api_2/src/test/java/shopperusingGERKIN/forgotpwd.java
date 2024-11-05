package shopperusingGERKIN;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class forgotpwd 
{
	@Test
	public void pwd()
	{
	 Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").auth().oauth2("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJya2tteWExMjNvQGdtYWlsLmNvbSBTSE9QUEVSIiwiZXhwIjoxNzI3OTY1MzEyLCJpYXQiOjE3Mjc5MjkzMTJ9.0vgHWfDTPi5eBHjw5StKiCS7kpg45fx1cdcn4WR3JCk").
			 headers("email","rkkmya123o@gmail.com","role","SHOPPER").
	 when().post("/users/forgot-password").then().assertThat().statusCode(200).extract().response();
	 System.out.println(res.asPrettyString());
    }
}
