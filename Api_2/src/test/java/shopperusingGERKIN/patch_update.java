package shopperusingGERKIN;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class patch_update
{
@Test
public void login()
{
	Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").body("{\r\n"
			+ "  \"city\": \"hubli\",\r\n"
			+ "  \"country\": \"uganda\",\r\n"
			+ "  \"email\": \"ramya123@gmail.com\",\r\n"
			+ "  \"firstName\": \"shamantha\",\r\n"
			+ "  \"gender\": \"FEMALE\",\r\n"
			+ "  \"lastName\": \"rftgyh\",\r\n"
			+ "  \"password\": \"keerthamna123\",\r\n"
			+ "  \"phone\": 9876524132,\r\n"
			+ "  \"state\": \"cheannail\",\r\n"
			+ "  \"zoneId\": \"ALPHA\"\r\n"
			+ "}\r\n"
			+ "}").auth().
			oauth2("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJya2tteWExMjNvQGdtYWlsLmNvbSBTSE9QUEVSIiwiZXhwIjoxNzI3OTY1MzEyLCJpYXQiOjE3Mjc5MjkzMTJ9.0vgHWfDTPi5eBHjw5StKiCS7kpg45fx1cdcn4WR3JCk").
			contentType(ContentType.JSON).when().patch("/shoppers/145942").
			then().assertThat().statusCode(200).extract().response();
	System.out.println(res.asPrettyString());
}
}
//contentType(ContentType.JSON).when().post("/shoppers/145942").
//auth().oauth2("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJya2tteWExMjNvQGdtYWlsLmNvbSBTSE9QUEVSIiwiZXhwIjoxNzI3OTY1MzEyLCJpYXQiOjE3Mjc5MjkzMTJ9.0vgHWfDTPi5eBHjw5StKiCS7kpg45fx1cdcn4WR3JCk").