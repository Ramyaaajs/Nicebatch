package aPISCRIPTS;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import gENERIC.Spec_builder_post;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import uTILS.Get_properties;

public class Createshopper 
{
@Test
public void Create()
{
	Get_properties g=new Get_properties();//fetch from utils
	String url = g.get("baseurl");
	String endpoint = g.get("createshopperendpt");
	RandomStringUtils r=new RandomStringUtils();
	String rand = r.randomAlphanumeric(5);
	String randomemail = rand + "@gmail.com";
	Spec_builder_post s=new Spec_builder_post();
	RequestSpecification req = s.request(url,"{\r\n"
			+ "  \"city\": \"tumkur\",\r\n"
			+ "  \"country\": \"tamilnadu\",\r\n"
			+ "  \"email\": \""+randomemail+"\",\r\n"      //if i want pass variable "+varname+"
			+ "  \"firstName\": \"chaomyajs\",\r\n"
			+ "  \"gender\": \"FEMALE\",\r\n"
			+ "  \"lastName\": \"ramgfhyf\",\r\n"
			+ "  \"password\": \"yym@123\",\r\n"
			+ "  \"phone\": 9110213283,\r\n"
			+ "  \"state\": \"andra\",\r\n"
			+ "  \"zoneId\": \"ALPHA\"\r\n"
			+ "}","application/json");
	ResponseSpecification res = s.response(201,"HTTP/1.1 201 ", "application/json");
	Response resp = RestAssured.given().spec(req).when().post(endpoint).then().spec(res).extract().response();
	System.out.println(resp.asPrettyString());
	String body = resp.asPrettyString();
	JsonPath jp= new JsonPath(body);
	String userid = jp.getString("data.userId");
	System.out.println(userid);
	
   
}
	
	
	
}
