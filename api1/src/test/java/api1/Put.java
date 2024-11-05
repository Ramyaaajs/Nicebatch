package api1;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put 
{
	public static void main(String[] args)
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req=RestAssured.given();
		JSONObject obj = new JSONObject();
		obj.put("name","morpheus");
		obj.put("job","zion resident");
		req.contentType(ContentType.JSON);
		req.body(obj.toJSONString());
		Response res = req.request(Method.POST,"/api/users/2");
		System.out.println(res.statusCode());
		System.out.println(res.asPrettyString());//all same for put also responsealso same
	}
}
