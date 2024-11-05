package spec_Builder;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class postmethod
{
	@Test
	public void post()
	{
		Generi_script gebdy=new Generi_script();
		RequestSpecification req = gebdy.request2("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}");
		ResponseSpecification res = gebdy.response();
	   Response resp = RestAssured.given().spec(req).when().post("/api/users").then().spec(res).extract().response();
	   System.out.println(resp.asPrettyString());
	}
}
