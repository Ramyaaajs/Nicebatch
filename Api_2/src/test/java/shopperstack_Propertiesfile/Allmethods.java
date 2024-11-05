package shopperstack_Propertiesfile;

import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import proPertiesfile.Getproperties_byusing_try_nd_catch;
import proPertiesfile.Getpropertiesshopper;

public class Allmethods 
{
	@Test
	public void runnerpost() throws IOException
	{
	Getpropertiesshopper gp=new Getpropertiesshopper();
	String url1 = gp.Getpropertiesshopper("baseurlshop");
	System.out.println(url1);
	String endpt = gp.Getpropertiesshopper("endpointshopcrete");
	System.out.println(endpt);
	  Response res = RestAssured.given().baseUri(url1).body("{\r\n"
			+ "  \"city\": \"Piptur\",\r\n"
			+ "  \"country\": \"India\",\r\n"
			+ "  \"email\": \"xxxhylgh@gmail.com\",\r\n"
			+ "  \"firstName\": \"Ramya\",\r\n"
			+ "  \"gender\": \"FEMALE\",\r\n"
			+ "  \"lastName\": \"jsghhj\",\r\n"
			+ "  \"password\": \"xxxtsss@12345\",\r\n"
			+ "  \"phone\": \"9373298440\",\r\n"
			+ "  \"state\": \"Marnataka\",\r\n"
			+ "  \"zoneId\": \"ALPHA\"\r\n"
			+ "}").contentType(ContentType.JSON).
	when().post(endpt).then().extract().response();
	  System.out.println(res.asPrettyString());
	  
  }
	@Test
	public void runnerlogin() throws IOException
	{
		Getpropertiesshopper gp=new Getpropertiesshopper();
		String url2 = gp.Getpropertiesshopper("baseurlshop");
		System.out.println(url2);
		String endlgn = gp.Getpropertiesshopper("endpointlogin");
		System.out.println(endlgn);
		Response res = RestAssured.given().baseUri(url2).body("{\r\n"
				+ "  \"email\": \"jjjhylgh@gmail.com\",\r\n"
				+ "  \"password\": \"yyytsss@12345\",\r\n"
				+ "  \"role\": \"SHOPPER\"\r\n"
				+ "}\r\n"
				+ "}").contentType(ContentType.JSON).when().post(endlgn).then().assertThat().extract().response();
		System.out.println(res.asPrettyString());
	}
	@Test
	public void forgotpwd() throws IOException
	{
		Getpropertiesshopper gp =new Getpropertiesshopper();
		String url3 = gp.Getpropertiesshopper("baseurlshop");
		System.out.println(url3);
		String eml = gp.Getpropertiesshopper("email1");
		System.out.println(eml);
		String rl = gp.Getpropertiesshopper("role");
		System.out.println(rl);
		String endfrpwd = gp.Getpropertiesshopper("endptforgotpwd");
		System.out.println(endfrpwd);
		Response res = RestAssured.given().baseUri(url3).headers("email",eml,"role",rl).
				when().post(endfrpwd).then().assertThat().extract().response();
		System.out.println(res.asPrettyString());
	}
	@Test
	public void verify() throws IOException
	{
		Getpropertiesshopper gp=new Getpropertiesshopper();
		String url4 = gp.Getpropertiesshopper("baseurlshop");
		System.out.println(url4);
		String pd1 = gp.Getpropertiesshopper("pwd");
		System.out.println(pd1);
		String tkn = gp.Getpropertiesshopper("token");
		System.out.println(tkn);
		String endpt = gp.Getpropertiesshopper("endptverifyac");
		System.out.println(endpt);
		Response res = RestAssured.given().baseUri(url4).header("password",pd1).queryParam("token",tkn).when().post(endpt).
		then().assertThat().extract().response();
		System.out.println(res.asPrettyString());
	}
	@Test
	public void resetpwd() throws IOException
	{
		Getpropertiesshopper gp=new Getpropertiesshopper();
		String url5 = gp.Getpropertiesshopper("baseurlshop");
		System.out.println(url5);
		//String pd2 = gp.Getpropertiesshopper("pwd");
		//System.out.println(pd2);
		String tkn2 = gp.Getpropertiesshopper("token");
		System.out.println(tkn2);
		//gp.Getpropertiesshopper(tkn2);
		String endpt2 = gp.Getpropertiesshopper("endptresetpwd");
		System.out.println(endpt2);
		Response res = RestAssured.given().baseUri(url5).body("{\"yyytsss@12345\"\r\n"
				+ "}").header("token",tkn2).when().post(endpt2).then().
		assertThat().extract().response();
		System.out.println(res.asPrettyString());//reset pwd dont do its not implemented
	}
    @Test
    public void updatepatch() throws IOException
    {
    	Getpropertiesshopper gp=new Getpropertiesshopper();
    	String url = gp.Getpropertiesshopper("baseurlshop");
    	System.out.println(url);
    	String uid = gp.Getpropertiesshopper("userid");
    	System.out.println(uid);
    	String endpt = gp.Getpropertiesshopper("endptupate");
    	RestAssured.given().baseUri(url).body("{\r\n"
    			+ "  \"city\": \"piiptur\",\r\n"
    			+ "  \"country\": \"India\",\r\n"
    			+ "  \"email\": \"klndia321@gmail.com\",\r\n"
    			+ "  \"firstName\": \"string\",\r\n"
    			+ "  \"gender\": \"FEMALE\",\r\n"
    			+ "  \"lastName\": \"ramya12\",\r\n"
    			+ "  \"password\": \"string@123\",\r\n"
    			+ "  \"phone\": 9853998330,\r\n"
    			+ "  \"state\": \"Karnataka\",\r\n"
    			+ "  \"zoneId\": \"ALPHA\"\r\n"
    			+ "}").when().patch(endpt).then().assertThat().extract().response();
    }
}
