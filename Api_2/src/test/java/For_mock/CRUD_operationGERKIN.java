package For_mock;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CRUD_operationGERKIN
{
@Test
public void post()
{
	
Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").body("{\r\n"
		+ "  \"city\": \"tiptir\",\r\n"
		+ "  \"country\": \"india\",\r\n"
		+ "  \"email\": \"ramaya12@gmail.com\",\r\n"
		+ "  \"firstName\": \"ramyajjjj\",\r\n"
		+ "  \"gender\": \"MALE\",\r\n"
		+ "  \"lastName\": \"jsrnhy\",\r\n"
		+ "  \"password\": \"ramya@1233\",\r\n"
		+ "  \"phone\": 9876543210,\r\n"
		+ "  \"state\": \"karnataka\",\r\n"
		+ "  \"zoneId\": \"ALPHA\"\r\n"
		+ "}\r\n"
		+ "}").contentType(ContentType.JSON).when().post("/shoppers").then().assertThat().statusCode(201).extract().response();
System.out.println(res.asPrettyString());
}
@Test
public void postlogin()
{
	Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").body("{\r\n"
			+ "  \"email\": \"ramaya12@gmail.com\",\r\n"
			+ "  \"password\": \"ramya@1233\",\r\n"
			+ "  \"role\": \"SHOPPER\"\r\n"
			+ "}\r\n"
			+ "}").contentType(ContentType.JSON).when().post("/users/login").then().assertThat().statusCode(200).extract().response();
	System.out.println(res.asPrettyString());
	String body = res.asPrettyString();
	JsonPath js=new JsonPath(body);
	String userid = js.getString("data.userId");
	System.out.println(userid);
	String barertoken = js.getString("data.jwtToken");
	System.out.println(barertoken);	
}
@Test
public void get()
{
	Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").auth().
	oauth2("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJyYW1heWExMkBnbWFpbC5jb20gU0hPUFBFUiIsImV4cCI6MTcyOTI3NjA0NCwiaWF0IjoxNzI5MjQwMDQ0fQ.g1uv6_v2vhxRN6vpnJA_byRL2sf2vQJeLFQCYJZz5F4").
	when().get("/shoppers/150276").then().assertThat().statusCode(200).extract().response();
	System.out.println(res.asPrettyString());
}
@Test
public void patch()
{
	Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").body("{\r\n"
			+ "  \"city\": \"tiptur\",\r\n"
			+ "  \"country\": \"china\",\r\n"
			+ "  \"email\": \"ranya@gmail.com\",\r\n"
			+ "  \"firstName\": \"yfhwsvc\",\r\n"
			+ "  \"gender\": \"MALE\",\r\n"
			+ "  \"lastName\": \"jhbcjwd\",\r\n"
			+ "  \"password\": \"ythv@123\",\r\n"
			+ "  \"phone\": 9638527410,\r\n"
			+ "  \"state\": \"chennail\",\r\n"
			+ "  \"zoneId\": \"ALPHA\"\r\n"
			+ "}\r\n"
			+ "}").auth().
	oauth2("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJyYW1heWExMkBnbWFpbC5jb20gU0hPUFBFUiIsImV4cCI6MTcyOTI3NjA0NCwiaWF0IjoxNzI5MjQwMDQ0fQ.g1uv6_v2vhxRN6vpnJA_byRL2sf2vQJeLFQCYJZz5F4").
	contentType(ContentType.JSON).when().patch("/shoppers/150276").then().assertThat().statusCode(200).extract().response();
	System.out.println(res.asPrettyString());
}
@Test
public void postadress()
{
RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").body("{\r\n"
			+ "  \"addressId\": 0,\r\n"
			+ "  \"buildingInfo\": \"#127 qspiders\",\r\n"
			+ "  \"city\": \"Bangalore\",\r\n"
			+ "  \"country\": \"India\",\r\n"
			+ "  \"landmark\": \"City hospital\",\r\n"
			+ "  \"name\": \"Rammyaa\",\r\n"
			+ "  \"phone\": \"9743982175\",\r\n"
			+ "  \"pincode\": \"530068\",\r\n"
			+ "  \"state\": \"Karnatak\",\r\n"
			+ "  \"streetInfo\": \"Rajajinagar\",\r\n"
			+ "  \"type\": \"string\"\r\n"
			+ "}").contentType(ContentType.JSON).when().post("/shoppers/150276/address").then().log().all();
	//System.out.println(res.asPrettyString());			
}
@Test
public void put()
{
	Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").body("{\r\n"
			+ "  \"addressId\": 0,\r\n"
			+ "  \"buildingInfo\": \"qspider\",\r\n"
			+ "  \"city\": \"hubli\",\r\n"
			+ "  \"country\": \"india\",\r\n"
			+ "  \"landmark\": \"rajajinagar\",\r\n"
			+ "  \"name\": \"poorna\",\r\n"
			+ "  \"phone\": \"9876542310\",\r\n"
			+ "  \"pincode\": \"572201\",\r\n"
			+ "  \"state\": \"karnataka\",\r\n"
			+ "  \"streetInfo\": \"secondblock\",\r\n"
			+ "  \"type\": \"string\"\r\n"
			+ "}\r\n"
			+ "}").auth()
	.oauth2("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJyYW1heWExMkBnbWFpbC5jb20gU0hPUFBFUiIsImV4cCI6MTcyOTM1NDEzNCwiaWF0IjoxNzI5MzE4MTM0fQ.V2X-Nqo2sfge2GkzrSOFMeeVwjLqTzZ3F2j5zg4KjBY").
	contentType(ContentType.JSON).when().put("/shoppers/150276/address/57407").then().assertThat().extract().response();
System.out.println(res.asPrettyString());
}

}
