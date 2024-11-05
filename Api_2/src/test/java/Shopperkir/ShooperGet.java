package Shopperkir;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ShooperGet {

	public static void main(String[] args)
	{
		RestAssured.baseURI="https://www.shoppersstack.com/shopping";
	    RequestSpecification req = RestAssured.given();
	    JSONObject obj=new JSONObject();
	    obj.put("city","Tiprur");
	    obj.put("country","India");
	    obj.put("email","ramyakirthana@gmail.com");
	    obj.put("firstName","Ramyaa");
	    obj.put("gender","FEMALE");
	    obj.put("lastName","jsrad");
	    obj.put("password","paassed@123");
	    obj.put("phone","9886543210");
	    obj.put("state","karnataka");
	    obj.put("zoneId","ALPHA");
	    req.contentType(ContentType.JSON);
	    req.body(obj.toJSONString());//body(string object)we have to select
	    Response res = req.request(Method.POST,"/shoppers");
	    System.out.println(res.statusCode());
	    System.out.println(res.asPrettyString());	
	    

	}

}
