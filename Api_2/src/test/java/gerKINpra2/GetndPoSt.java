package gerKINpra2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetndPoSt 
{
@Test
public void post()
{
	 Response res = RestAssured.given().baseUri("https://reqres.in/").body("{\r\n"
			+ "    \"name\": \"morpheus\",\r\n"
			+ "    \"job\": \"leader\"\r\n"
			+ "}").when().post("/api/users").then().assertThat().statusCode(201).extract().response();
	System.out.println(res.asPrettyString());
}
@Test
public void get()
{
Response res = RestAssured.given().baseUri("https://reqres.in/").when().get("/api/users/2").then().assertThat().statusCode(200).extract().response();
System.out.println(res.asPrettyString());

}
}

