package pOJO2_for_createShpr;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Runnercls_postcreate 
{
@Test
public void post()
{
	Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").
			body("{\r\n"
					+ "  \"city\": \"kiptur\",\r\n"
					+ "  \"country\": \"India\",\r\n"
					+ "  \"email\": \"spaantdhu@gmail.com\",\r\n"
					+ "  \"firstName\": \"Ramya\",\r\n"
					+ "  \"gender\": \"FEMALE\",\r\n"
					+ "  \"lastName\": \"jsghhj\",\r\n"
					+ "  \"password\": \"Mass@12345\",\r\n"
					+ "  \"phone\": \"9503298440\",\r\n"
					+ "  \"state\": \"karnataka\",\r\n"
					+ "  \"zoneId\": \"ALPHA\"\r\n"
					+ "}").contentType(ContentType.JSON).when().post("/shoppers").then().assertThat()
			.statusCode(201).extract().response();
	System.out.println(res.asPrettyString());
   Shopper body = res.as(Shopper.class);
	Data d1 = body.getData();
	String fn = d1.getFirstName();
  System.out.println(fn);
  String msg = body.getMessage();
  System.out.println(msg);


}
}
