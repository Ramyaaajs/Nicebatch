package reqresss;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Create 
{
	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
	    RequestSpecification req = RestAssured.given();
	    JSONObject obj=new JSONObject();
	    obj.put("name","morpheus");
	    obj.put("job","leader");
	    req.contentType(ContentType.JSON);
	    req.body(obj.toJSONString());
	    Response res = req.request(Method.POST,"/api/users");
	    String body = res.asPrettyString();
	    System.out.println(body);
	    System.out.println(res.statusCode());
	}

}
