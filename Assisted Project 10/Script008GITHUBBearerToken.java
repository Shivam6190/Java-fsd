package restassureScripts;


import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Script008GITHUBBearerToken {

	
	@Test(priority='1')
	public void Authorization_bearertoken()
	{
		
	Response res=	given().baseUri("https://api.github.com")
		.basePath("/user/repos")
		.header("Authorization","Bearer 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")
		.when().get()
		.then().statusCode(200)
		.extract().response();
	
		res.prettyPrint();
	}
	
	
	

	
	@Test(priority='2')
	public void Authorization_bearertoken_specificrepo()
	{
		
	Response res=	given().baseUri("https://api.github.com")
		.basePath("/repos/Shivam6190/Calculator")
		.header("Authorization","Bearer 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")
		.when().get()
		.then().statusCode(200)
		.extract().response();
	
		res.prettyPrint();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}