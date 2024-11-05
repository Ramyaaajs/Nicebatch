package Shopperkir;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Shpperlogin 
{

	public static void main(String[] args)
	{
		RestAssured.baseURI="https://www.shoppersstack.com/shopping";
	    RequestSpecification req = RestAssured.given();
	    JSONObject obj=new JSONObject();
	    obj.put("email","niikiriikir@gmail.com");
	    obj.put("password","kovivss@123");
	    obj.put("role","SHOPPER");
	    req.contentType(ContentType.JSON);
	    req.body(obj.toJSONString());//body(string object)we have to select
	    Response res = req.request(Method.POST,"/users/login");
	    System.out.println(res.statusCode());
	    String body = res.asPrettyString();
	    System.out.println(body);
	    JsonPath jp=new JsonPath(body);//add this 3line for get operation 
	    Object data1 = jp.get("data.userId");//o/p-we will get
	    System.out.println(data1);
	}

}
