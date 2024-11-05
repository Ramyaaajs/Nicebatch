package For_mock;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Mock 
{
@Test
public void post()
{
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification req = RestAssured.given();
	JSONObject obj=new JSONObject();
	obj.put("email","eve.holt@reqres.in");
	obj.put("password","pistol");
	req.contentType(ContentType.JSON);
	req.body(obj.toJSONString());
	Response res = req.request(Method.POST,"/api/register");
	System.out.println(res.statusCode());
	System.out.println(res.asPrettyString());
}
@Test
public void postshop()
{
	Response res = RestAssured.given().baseUri("https://www.shoppersstack.com/shopping").body("{\r\n"
			+ "  \"city\": \"tiptir\",\r\n"
			+ "  \"country\": \"india\",\r\n"
			+ "  \"email\": \"pootygya12@gmail.com\",\r\n"
			+ "  \"firstName\": \"somyaajjjj\",\r\n"
			+ "  \"gender\": \"MALE\",\r\n"
			+ "  \"lastName\": \"tyfhhv\",\r\n"
			+ "  \"password\": \"apity@1233\",\r\n"
			+ "  \"phone\": 9226543210,\r\n"
			+ "  \"state\": \"karnataka\",\r\n"
			+ "  \"zoneId\": \"ALPHA\"\r\n"
			+ "}\r\n"
			+ "}").contentType(ContentType.JSON).when().post("/shoppers").then().assertThat().statusCode(201).extract().response();
	System.out.println(res.asPrettyString());
	}
}
