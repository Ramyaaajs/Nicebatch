package api1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete
{

	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req=RestAssured.given();
		Response res = req.request(Method.DELETE,"api/users/2");
		System.out.println(res.asPrettyString());
		System.out.println(res.statusCode());

	}

}
