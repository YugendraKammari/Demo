package project2;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test1 {
	
	String baseUrl="http://localhost:9090/api/tutorials";
	
	public void getAllTutorials()
	{
		//1.set the base url
		RestAssured.baseURI=baseUrl;
		
		//2.Create Request object
		RequestSpecification httpRequest=RestAssured.given();
		
		//3.Get the Response object
		Response response=httpRequest.request(Method.GET);
		
		//4.Verify the result
		int expectedStatusCode=200;
		int actualStatusCode=response.getStatusCode();
		Assert.assertEquals(actualStatusCode, expectedStatusCode);
		String responseContent=response.getBody().asString();
		System.out.println(responseContent);
		
	}
    @Test
	public void getTutorialById()
	{
		//1.set the base url
		RestAssured.baseURI=baseUrl;
		
		//2.Create Request object
		RequestSpecification httpRequest=RestAssured.given();
		
		//3.Get the Response object
		Response response=httpRequest.request(Method.GET);
		
		//4.Verify the result
		int expectedStatusCode=200;
		int actualStatusCode=response.getStatusCode();
		Assert.assertEquals(actualStatusCode, expectedStatusCode);			
	}
	
    public void createTutorials()
    {
    	//1.set the base url
    	RestAssured.baseURI="http://localhost:9090/api/tutorials/1";
    	
    	//2.Create Request object
    	RequestSpecification httpRequest=RestAssured.given();
    	JSONObject json=new JSONObject();
    	json.put("id", 2);
    	json.put("title", "python");
    	json.put("description", "python tutorial");
    	json.put("published", "false");
    	httpRequest.header("Content-Type","application/json");
    	httpRequest.body(json.toJSONString());
    	
    	//3.Get the Response object
    	Response response=httpRequest.request(Method.POST);
    	
    	//4.Verify the result
    	int expectedStatusCode=200;
    	int actualStatusCode=response.getStatusCode();
    	Assert.assertEquals(actualStatusCode, expectedStatusCode);	
    	
    }
  
}

