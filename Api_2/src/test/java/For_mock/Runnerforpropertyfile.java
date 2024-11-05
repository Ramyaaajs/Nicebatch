package For_mock;

import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Runnerforpropertyfile
{
@Test
public void get() throws IOException
{
	Response res = RestAssured.given().baseUri(Getpropertiesfile.get()).when().get(Getpropertiesfile.get1()).
	then().assertThat().statusCode(200).extract().response();
	System.out.println(res.asPrettyString());
}
}
