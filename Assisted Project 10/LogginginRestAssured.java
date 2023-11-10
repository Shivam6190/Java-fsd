package restassureScripts;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class LogginginRestAssured {
	
	
	@Test(priority='1')
	public void loggingmethods()
	{
		String PMapikey = "PMAK-65447e43cd4b2a351ceeaf58-66f4a5c1b9c0be3b8ec120450259246411";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		//.then().statusCode(200).log().headers()
		//.then().log().ifError()
		//.then().statusCode(200).log().cookies();
		.then().statusCode(200).log().all();
		
		
	}

}