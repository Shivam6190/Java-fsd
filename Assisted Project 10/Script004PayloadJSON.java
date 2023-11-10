package restassureScripts;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;

public class Script004PayloadJSON {
	
	
	// Send the body with the post request with content type as JSON
	
	// Sending JSON data directly from test method
	
	@Test
	public void postusingJSON()
	{
		
		JSONObject body = new JSONObject();
		body.put("name", "meghna");
		body.put("salary", "4567");
		body.put("age", "30");
		
	int responseid =	RestAssured.given()
		.baseUri("https://dummy.restapiexample.com/api/v1")
		.contentType(ContentType.JSON)
		.body(body.toString())
		.when().post("/create")
		.then()
		.statusCode(200)
		.body("data.name", equalTo("meghna")) // validate the name created is megha or not
		.extract().path("data.id");
	
	System.out.println(responseid);
		
		
		
	}

}