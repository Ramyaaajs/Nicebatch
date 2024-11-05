package aPISCRIPTS;



import org.testng.annotations.Test;

import gENERIC.Spec_builder_login;
import gENERIC.Spec_builder_post;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import uTILS.Get_properties;

public class Loginshopper 
{
@Test
public void login()
{
	Get_properties gp=new Get_properties();
	String url = gp.get("baseurl");
	String endpoint = gp.get("loginsopendpt");
    Spec_builder_login s=new Spec_builder_login();
    RequestSpecification req = s.request(url,"{\r\n"
    		+ "  \"email\": \"9Jgrn@gmail.com\",\r\n"
    		+ "  \"password\": \"yym@123\",\r\n"
    		+ "  \"role\": \"SHOPPER\"\r\n"
    		+ "}","application/json");
    ResponseSpecification res = s.response(200,"application/json");
  Response result = RestAssured.given().spec(req).when().post(endpoint).then().spec(res).extract().response();
  System.out.println(result.asPrettyString());
  String body = result.asPrettyString();
  JsonPath js=new JsonPath(body);
 String barertoken = js.getString("body.jwtToken");
 //return barertoken
}
}
