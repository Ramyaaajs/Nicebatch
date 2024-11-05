package For_mock;

import java.io.File;

import org.junit.experimental.theories.suppliers.TestedOn;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Single_user
{
	@Test
	public void get()
	{
Spec_builder sp=new Spec_builder();
RequestSpecification req = sp.request();
ResponseSpecification res = sp.response();
Response result = RestAssured.given().spec(req).when().get("/api/users/2").then().spec(res).extract().response();
System.out.println(result.asPrettyString());

	}
}
