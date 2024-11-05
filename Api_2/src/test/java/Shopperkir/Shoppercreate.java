package Shopperkir;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Shoppercreate 
{
	public static void main(String[] args)
	{
    RestAssured.baseURI="https://www.shoppersstack.com/shopping";
    RequestSpecification req = RestAssured.given();
    JSONObject obj=new JSONObject();
    obj.put("city","Tiprur");
    obj.put("country","India");
    obj.put("email","niikiriikir@gmail.com");
    obj.put("firstName","oommyaa");
    obj.put("gender","FEMALE");
    obj.put("lastName","jsrad");
    obj.put("password","kovivss@123");
    obj.put("phone","9556543210");
    obj.put("state","karnataka");
    obj.put("zoneId","ALPHA");
    req.contentType(ContentType.JSON);
    req.body(obj.toJSONString());//body(string object)we have to select
    Response res = req.request(Method.POST,"/shoppers");
    System.out.println(res.statusCode());
    String body = res.asPrettyString();
   // JsonPath jp=new JsonPath(body);
    //Object data = jp.get("role");
    //System.out.println(data);
    
	}

}
