package runnerscrpt_ProPertiesfile;

import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
//import io.restassured.response.ValidatableResponse;
import proPertiesfile.Get_properties;

public class Runnerscrpit_10_5_24 
{
@Test
public void login() throws IOException
{
Response res = RestAssured.given().baseUri(Get_properties.Getdata()).when().get("/api/users/2").then().extract().response();
System.out.println(res.asPrettyString());
}
}
