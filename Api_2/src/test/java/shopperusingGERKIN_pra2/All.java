package shopperusingGERKIN_pra2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class All
{
@Test
public void create()
{
	Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").body("{\r\n"
			+ "  \"city\": \"Tiptur\",\r\n"
			+ "  \"country\": \"India\",\r\n"
			+ "  \"email\": \"kummmya@gmail.com\",\r\n"
			+ "  \"firstName\": \"ooaaamyaaaa\",\r\n"
			+ "  \"gender\": \"FEMALE\",\r\n"
			+ "  \"lastName\": \"jsssssra\",\r\n"
			+ "  \"password\": \"mummya@123\",\r\n"
			+ "  \"phone\": 9335381477,\r\n"
			+ "  \"state\": \"karnataka\",\r\n"
			+ "  \"zoneId\": \"ALPHA\"\r\n"
			+ "}\r\n"
			+ "}").contentType(ContentType.JSON).when().post("/shoppers").then().assertThat().statusCode(201).extract().response();
	System.out.println(res.asPrettyString());// 146408
}
@Test
public void login()
{
	Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").body("{\r\n"
			+ "  \"email\": \"mummya@gmail.com\",\r\n"
			+ "  \"password\": \"mummya@123\",\r\n"
			+ "  \"role\": \"SHOPPER\"\r\n"
			+ "}\r\n"
			+ "}").contentType(ContentType.JSON).when().post("/users/login").then().statusCode(200).extract().response();
	System.out.println(res.asPrettyString());
}
@Test
public void forgotpwd()
{
	Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").
	headers("email","bammya@gmail.com","role","SHOPPER").when().post("/users/forgot-password").
	then().assertThat().statusCode(200).extract().response();
   System.out.println(res.asPrettyString());
}
@Test
public void verify()
{
	Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").header("password","ramya@123").
	queryParam("token","TWOMoOWFP9InkcdZ0rUxBTY60HxROt5x5zPhOburJwiWJ").when().post("/users/verify-account").
	then().assertThat().statusCode(200).extract().response();
	System.out.println(res);
}
@Test
public void getshopperdata()
{
	Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").auth().
	oauth2("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJtdW1teWFAZ21haWwuY29tIFNIT1BQRVIiLCJleHAiOjE3MjgwNDkyNzksImlhdCI6MTcyODAxMzI3OX0.53YIHdV11n0ClgrTlEHyedCFgp9csd00gLBvjwRL65M").
	when().get("/shoppers/146408").
then().assertThat().statusCode(200).extract().response();
	System.out.println(res.asPrettyString());
}
@Test
public void updatepatch()
{
	Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").body("{\r\n"
			+ "  \"city\": \"piiptur\",\r\n"
			+ "  \"country\": \"India\",\r\n"
			+ "  \"email\": \"klndia321@gmail.com\",\r\n"
			+ "  \"firstName\": \"string\",\r\n"
			+ "  \"gender\": \"FEMALE\",\r\n"
			+ "  \"lastName\": \"ramya12\",\r\n"
			+ "  \"password\": \"string@123\",\r\n"
			+ "  \"phone\": 9853998330,\r\n"
			+ "  \"state\": \"Karnataka\",\r\n"
			+ "  \"zoneId\": \"ALPHA\"\r\n"
			+ "}").
			auth().
	oauth2("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJtdW1teWFAZ21haWwuY29tIFNIT1BQRVIiLCJleHAiOjE3MjgwNDkyNzksImlhdCI6MTcyODAxMzI3OX0.53YIHdV11n0ClgrTlEHyedCFgp9csd00gLBvjwRL65M").
	contentType(ContentType.JSON).when().patch("/shoppers/146408").then().assertThat().statusCode(200).extract().response();
	System.out.println(res.asPrettyString());
}
}

