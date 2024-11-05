package shopperusingGERKIN;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post
{
	@Test
	public void post12()
	{
		Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").body("{\r\n"
				+ "  \"city\": \"Piptur\",\r\n"
				+ "  \"country\": \"India\",\r\n"
				+ "  \"email\": \"rkkmya123o@gmail.com\",\r\n"
				+ "  \"firstName\": \"Ramya\",\r\n"
				+ "  \"gender\": \"FEMALE\",\r\n"
				+ "  \"lastName\": \"jsghhj\",\r\n"
				+ "  \"password\": \"Paerss@12345\",\r\n"
				+ "  \"phone\": \"9243298440\",\r\n"
				+ "  \"state\": \"Marnataka\",\r\n"
				+ "  \"zoneId\": \"ALPHA\"\r\n"
				+ "}").contentType(ContentType.JSON).when().post("/shoppers").then().assertThat().statusCode(201).extract().response();
		System.out.println(res.asPrettyString());
	}
}
