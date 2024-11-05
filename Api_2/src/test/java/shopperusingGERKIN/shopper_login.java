package shopperusingGERKIN;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class shopper_login
{
	@Test
	public void post()
	{
		Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").body("{\r\n"
				+ "  \"email\": \"rkkmya123o@gmail.com\",\r\n"
				+ "  \"password\": \"Paerss@12345\",\r\n"
				+ "  \"role\": \"SHOPPER\"\r\n"
				+ "}").contentType(ContentType.JSON).when().post("/users/login").then().assertThat().statusCode(200).extract().response();
		System.out.println(res.asPrettyString());
	    String body = res.asPrettyString();
	    JsonPath jp=new JsonPath(body);
	    String userID = jp.getString("data.userId");
	    System.out.println(userID);
	
//	@Test
//	public void get()
//	{
//		RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").auth().oauth2("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJya2tteWExMjNvQGdtYWlsLmNvbSBTSE9QUEVSIiwiZXhwIjoxNzI3OTY0NDI4LCJpYXQiOjE3Mjc5Mjg0Mjh9.n5x6p1T6LY-I9BL65lpx6urZjPrld7ndjje76I6oJv4").
//		
//	}

}
}
