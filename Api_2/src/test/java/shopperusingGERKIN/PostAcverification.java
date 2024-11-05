package shopperusingGERKIN;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
//import static org.hamcrest.Description.*;

public class PostAcverification
{
	@Test
	public void verifytacs()
	{
	Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").
			header("password","keerthamna1234").queryParam("token","JvEJW4IAcYv39dwKkItTyYqfA4U6tXAz43282MFKuPOTI").
			//auth().oauth2("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJya2tteWExMjNvQGdtYWlsLmNvbSBTSE9QUEVSIiwiZXhwIjoxNzI3OTY1MzEyLCJpYXQiOjE3Mjc5MjkzMTJ9.0vgHWfDTPi5eBHjw5StKiCS7kpg45fx1cdcn4WR3JCk").
			when().post("/users/verify-account").then().assertThat().statusCode(200).extract().response();
			System.out.println(res.asPrettyString());
	}
}
