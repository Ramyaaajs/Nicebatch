package runnerscrpt_ProPertiesfile;

import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import proPertiesfile.Get_properties;
import proPertiesfile.Getpropertiesforendpoint;

public class Runnerscript2for_getpropertiesendpoint
{
@Test
public void get() throws IOException
{
	Response res = RestAssured.given().baseUri("https://reqres.in").when().get(Getpropertiesforendpoint.getenfpoint()).then().
			extract().response();
    System.out.println(res.asPrettyString());
	
}	
}
