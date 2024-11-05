package shopperstack_Propertiesfile;

import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import proPertiesfile.Getproperties_byusing_try_nd_catch;
import proPertiesfile.Getpropertiesshopper;

public class Create_AC2 
{
	@Test
	public void runnerpost() throws IOException
	{
		Getpropertiesshopper gp=new Getpropertiesshopper();
       String url = gp.Getpropertiesshopper("baseurlshop");
       System.out.println(url);
	  Response res = RestAssured.given().baseUri(url).body("{\r\n"
			+ "  \"city\": \"Piptur\",\r\n"
			+ "  \"country\": \"India\",\r\n"
			+ "  \"email\": \"xyzejylgh@gmail.com\",\r\n"
			+ "  \"firstName\": \"Ramya\",\r\n"
			+ "  \"gender\": \"FEMALE\",\r\n"
			+ "  \"lastName\": \"jsghhj\",\r\n"
			+ "  \"password\": \"iuytsss@12345\",\r\n"
			+ "  \"phone\": \"9003298440\",\r\n"
			+ "  \"state\": \"Marnataka\",\r\n"
			+ "  \"zoneId\": \"ALPHA\"\r\n"
			+ "}").contentType(ContentType.JSON).
	when().post("/shoppers").then().extract().response();
	  System.out.println(res.asPrettyString());
}
}
