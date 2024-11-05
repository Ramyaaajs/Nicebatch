package For_mock;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Runnercls
{
@Test
public void log()
{
	Response res = RestAssured.given().baseUri("https://reqres.in/").when().get("/api/users/2").then().assertThat().statusCode(200).extract().response();
   	Single_user2 body = res.as(Single_user2.class);
   	Data data = body.getData();
   	String res1 = data.getEmail();
   	System.out.println(res1);
}
}
