package Gherkin;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
//import io.restassured.response.ValidatableResponse;
@Test
public class Get
{
	@Test
	public void get()
	{
    //RestAssured.given().baseUri("https://reqres.in/").when().get("api/users?page=2").then().assertThat().statusLine("HTTP/1.1 200 OK");//this only just do assertion want to print we have to next upcooming line.
		 Response res = RestAssured.given().baseUri("https://reqres.in/").when().get("api/users?page=2").then().assertThat().statusLine("HTTP/1.1 200 OK").and().
				 extract().response();
		 System.out.println(res.asPrettyString());
	}
	@Test
	public void post()
	{
	        RestAssured.given().baseUri("https://reqres.in/").body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}").when().post("api/users").then().assertThat().statusCode(201);

    }
}
