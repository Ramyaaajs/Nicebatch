package Pojomockapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import pOJO.Data2;
import pOJO.Single_user2;

public class Runnerclass 
{
	@Test
	public void get()
	{
	Response res1 = RestAssured.given().baseUri("https://reqres.in/").when().get("/api/users/2").then().assertThat().extract().response();
	Single_user body = res1.as(Single_user.class);
	Datamock data = body.getData();
	String fn = data.getFirst_name();
	System.out.println(fn);
	}

}
