package aPISCRIPTS;

import org.testng.annotations.Test;

import gENERIC.Spec_builder_getshopdata;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import uTILS.Get_properties;

public class Getshooperdata
{
@Test
public void log()
{
	Get_properties gp=new Get_properties();
	String url = gp.get("baseurl");
	String endpt = gp.get("Shooperdataendpoint");
	String baretkn = gp.get("barertoken");
	Spec_builder_getshopdata sp=new Spec_builder_getshopdata();
	RequestSpecification req = sp.request(url,"application/json");
	ResponseSpecification res = sp.response(200,"application/json");
	Response resdata = RestAssured.given().spec(req).auth().oauth2(baretkn).when().get(endpt).then().spec(res).extract().response();
	System.out.println(resdata.asPrettyString());
	//String x = Loginshopper.login();
//	sp.request(url,"application/json").auth().oauth("+x+").

}
}
