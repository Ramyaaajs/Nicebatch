package shopperstack_Propertiesfile;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import proPertiesfile.Getproperties_byusing_try_nd_catch;

public class Create_ac_fetchurlandendpoint
{
	@Test
	public void runnerpost()
	{
	Getproperties_byusing_try_nd_catch gp = new Getproperties_byusing_try_nd_catch();
	String url1 = gp.Getproperties_byusing_try_nd_catch("baseurlshop");
	System.out.println(url1);
	String endpt = gp.Getproperties_byusing_try_nd_catch("endpointshopcrete");
	System.out.println( endpt);
	  Response res = RestAssured.given().baseUri(url1).body("{\r\n"
			+ "  \"city\": \"Piptur\",\r\n"
			+ "  \"country\": \"India\",\r\n"
			+ "  \"email\": \"omghijlgh@gmail.com\",\r\n"
			+ "  \"firstName\": \"Ramya\",\r\n"
			+ "  \"gender\": \"FEMALE\",\r\n"
			+ "  \"lastName\": \"jsghhj\",\r\n"
			+ "  \"password\": \"iuytsss@12345\",\r\n"
			+ "  \"phone\": \"9433298440\",\r\n"
			+ "  \"state\": \"Marnataka\",\r\n"
			+ "  \"zoneId\": \"ALPHA\"\r\n"
			+ "}").contentType(ContentType.JSON).
	when().post( endpt).then().extract().response();
	  System.out.println(res.asPrettyString());
}
}
