package restassureScripts;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Script003PostMethod {
	
	@Test
	public void postmethod()
	{
		// this is the payload that we have to send with the request
		// As this is a post request, using the below payload, we will create a user on the webpage
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "John");
		map.put("job", "Tester");
		
		RestAssured.
		given().baseUri("https://reqres.in/") // url
		.basePath("/api/users") // request
		.contentType("application/json")  // what type of content body we are sending - JSON
		.body(map) // this is the body to be sent with post request
		.when().post()
		.then().statusCode(201).log().all();
		
		
	}

}