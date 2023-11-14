package com.sporty.shoe.restAssuredScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostandPutnewShoe {
	
	@Test(priority='1')
	public void add_new_product() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/add-shoe")
		.queryParam("id", "1020")
		.queryParam("image","www.imge.com")
		.queryParam("name", "Puma")
		.queryParam("category", "sports")
		.queryParam("sizes", "6,7,8")
		.queryParam("price", "2000")
		.when()
		.post()
		.then()
		.log().all();
	}
	

	@Test(priority='2')
	public void update_new_product() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/add-shoe")
		.queryParam("id", "1020")
		.queryParam("image","www.imge.com")
		.queryParam("name", "Reebok")
		.queryParam("category", "sports")
		.queryParam("sizes", "6,7,8")
		.queryParam("price", "2000")
		.when()
		.post()
		.then()
		.log().all();
	}
	
	@Test(priority='3')
	public void delete_product()
	{
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/delete-shoe")
		.queryParam("id", "1020")
		.when().delete()
		.then().log().all();
		
	}
	
	
	


}
