
package RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class All 
{
@Test
public void post()
{
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification req = RestAssured.given();
	JSONObject obj=new JSONObject();
	obj.put("email","eve.holt@reqres.in");
	obj.put("password","pistol");
	req.contentType(ContentType.JSON);
	req.body(obj.toJSONString());
	Response res = req.request(Method.POST,"/api/register");
	System.out.println(res.statusCode());
	System.out.println(res.asPrettyString());//"token": "QpwL5tke4Pnpja7X4"
}
@Test
public void get()
{
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification req = RestAssured.given();
	Response res= req.request(Method.GET,"/api/users?page=2");
	System.out.println(res.statusCode());
	System.out.println(res.asPrettyString());
}
@Test
public void put()
{
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification req = RestAssured.given();
	JSONObject obj=new JSONObject();
	obj.put("name","morpheus");
	obj.put("job","zion resident");
	req.contentType(ContentType.JSON);
    req.body(obj.toJSONString());
    Response res = req.request(Method.PUT,"/api/users/2");
    System.out.println(res.statusCode());
    System.out.println(res.asPrettyString());
}
@Test
public void post2()
{
RestAssured.baseURI="https://reqres.in/";
RequestSpecification req = RestAssured.given();
JSONObject js=new JSONObject();
js.put("email","eve.holt@reqres.in");
js.put("password","pistol");
req.contentType(ContentType.JSON);
req.body(js.toJSONString());
Response res = req.request(Method.POST,"/api/register");
System.out.println(res.statusCode());
System.out.println(res.asPrettyString());
}

}

