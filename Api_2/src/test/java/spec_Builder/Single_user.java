package spec_Builder;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Single_user 
{
@Test
public void sing()
{
Generi_script g= new Generi_script();
RequestSpecification req=g.request();
ResponseSpecification res = g.response();
RestAssured.given().spec(req).when().get("/api/users/2").then().spec(res);
}
}
