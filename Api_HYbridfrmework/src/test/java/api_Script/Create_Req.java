package api_Script;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.Spec_builder;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import utils.Getproperties;

public class Create_Req 
{
@Test
public void post_req() throws IOException
{
	Getproperties gp=new Getproperties();
	String b = gp.get("baseurl");
	String c = gp.get("endpoint");
	Spec_builder sp=new Spec_builder();
	RequestSpecification bg = sp.request(b);
	//ResponseSpecification vg = sp.response(201,"HTTP/1.1 201 Created");
	//RestAssured.given().spec(bg).and().header("Conten)

}
}
