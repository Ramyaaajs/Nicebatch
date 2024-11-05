package reqresss;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Allmethods 
{
@Test
public void create()
{
	//RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").when().post("/shoppers").then().log().all();
	Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").
			body("{\r\n"
					+ "  \"city\": \"Piptur\",\r\n"
					+ "  \"country\": \"India\",\r\n"
					+ "  \"email\": \"homamya@gmail.com\",\r\n"
					+ "  \"firstName\": \"Ramya\",\r\n"
					+ "  \"gender\": \"FEMALE\",\r\n"
					+ "  \"lastName\": \"jsghhj\",\r\n"
					+ "  \"password\": \"poiss@12345\",\r\n"
					+ "  \"phone\": \"9693298440\",\r\n"
					+ "  \"state\": \"Marnataka\",\r\n"
					+ "  \"zoneId\": \"ALPHA\"\r\n"
					+ "}").contentType(ContentType.JSON).when().post("/shoppers").then().assertThat().
         statusCode(201).
       and().
        statusLine("HTTP/1.1 201").extract().response();
//   	 and().
     // header("Content-Length", "0").
     //and().
	System.out.println(res.asPrettyString());	
}
}
