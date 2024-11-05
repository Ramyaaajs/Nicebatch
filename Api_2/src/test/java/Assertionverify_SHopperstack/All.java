package Assertionverify_SHopperstack;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class All 
{
@Test
public void post()
{
	   ValidatableResponse res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").body("{\r\n"
			+ "  \"city\": \"Piptur\",\r\n"
			+ "  \"country\": \"India\",\r\n"
			+ "  \"email\": \"kilopjiylgh@gmail.com\",\r\n"
			+ "  \"firstName\": \"Ramya\",\r\n"
			+ "  \"gender\": \"FEMALE\",\r\n"
			+ "  \"lastName\": \"jsghhj\",\r\n"
			+ "  \"password\": \"iuytsss@12345\",\r\n"
			+ "  \"phone\": \"9823298440\",\r\n"
			+ "  \"state\": \"Marnataka\",\r\n"
			+ "  \"zoneId\": \"ALPHA\"\r\n"
			+ "}").contentType(ContentType.JSON).
	when().post("/shoppers").then().assertThat().log().all();
	
	/*.response(); //1st use then().log().all();-aftr get the data then u can use extract .responsebcz to use aspreittystring.
	String body = res.asPrettyString();
	System.out.println(body);
	JsonPath P=new JsonPath(body);
	Object userid = P.get("data.userId");
	System.out.println(userid);*/
}
	@Test
	public void login()
	{
		
		
	}
}

