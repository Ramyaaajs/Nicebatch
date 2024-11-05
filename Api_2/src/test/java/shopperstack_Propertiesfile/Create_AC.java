package shopperstack_Propertiesfile;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import proPertiesfile.Getproperties_byusing_try_nd_catch;

public class Create_AC 
{
	@Test
	public void runnerpost()
	{
	Getproperties_byusing_try_nd_catch gp = new Getproperties_byusing_try_nd_catch();
	String url1 = gp.Getproperties_byusing_try_nd_catch("baseurlshop");
	System.out.println(url1);
	  Response res = RestAssured.given().baseUri(url1).body("{\r\n"
			+ "  \"city\": \"Piptur\",\r\n"
			+ "  \"country\": \"India\",\r\n"
			+ "  \"email\": \"ythjylgh@gmail.com\",\r\n"
			+ "  \"firstName\": \"Ramya\",\r\n"
			+ "  \"gender\": \"FEMALE\",\r\n"
			+ "  \"lastName\": \"jsghhj\",\r\n"
			+ "  \"password\": \"iuytsss@12345\",\r\n"
			+ "  \"phone\": \"9223298440\",\r\n"
			+ "  \"state\": \"Marnataka\",\r\n"
			+ "  \"zoneId\": \"ALPHA\"\r\n"
			+ "}").contentType(ContentType.JSON).
	when().post("/shoppers").then().extract().response();
	  System.out.println(res.asPrettyString());
  }
	
}
