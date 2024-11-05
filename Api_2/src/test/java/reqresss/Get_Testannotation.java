package reqresss;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Get_Testannotation
{
@Test
public  void get()
{
	//RestAssured.given().baseUri("https://reqres.in/").when().get("/api/users/2").then().log().all();//print headers and time and all everything
	  Response res = RestAssured.given().baseUri("https://reqres.in").when().get("/api/users/2").then().assertThat().
	statusCode(200).
	and().
	contentType(ContentType.JSON).
	and().
	statusLine("HTTP/1.1 200 OK").
	and().
	headers("Content-Type","application/json; charset=utf-8","Transfer-Encoding","chunked").
	and().
	body("data.id",equalTo(2)).
	and().
	 //body("support.url".equalsIgnoreCase("https://reqres.in/#support-Heading").
	  //and().
	time(lessThan(5000L)).extract().response();	
     System.out.println(res.asPrettyString());
	//extract().response();	
   // headers(null, null, null)	
}
}
