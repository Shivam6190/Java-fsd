package restassureScripts;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Script006PostManAPIKey {

	
	
	@Test(priority='1')
	public void postmangetreq()
	{
		String PMapikey = "PMAK-65447e43cd4b2a351ceeaf58-66f4a5c1b9c0be3b8ec120450259246411";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then().statusCode(200).log().all();
		
		
	}
	
	
	@Test(priority='2')
	public void extract_value_response()
	{
		String PMapikey = "PMAK-65447e43cd4b2a351ceeaf58-66f4a5c1b9c0be3b8ec120450259246411";
		
		String responseoutput = given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then()
		.extract().path("workspaces[1].name"); // extracting the name and save it in a string
		
		System.out.println("The name of the workspace extracted is: " + responseoutput);
		
	}
	
	
	

	@Test(priority='3')
	public void extract_response_JSONPath()
	{
		String PMapikey = "PMAK-65447e43cd4b2a351ceeaf58-66f4a5c1b9c0be3b8ec120450259246411";
		
		Response res = given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then()
		.extract().response(); // extracting the response and save it in a Response object
		
		JsonPath json = new JsonPath(res.asString());
		
		System.out.println(json.getString("workspaces[4]"));
		
	}
	
}
	