package com.app.junitDemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeAfterEachAnnotation {
	
	// @BeforeEach and @AfterEach are similar to TestNG @BeforeMethod @AfterMethod
	
	JavaOperation obj;
	
	@BeforeEach    // execute the init() before each test method
	public void init() {
		System.out.println("Start DB connection");
		obj = new JavaOperation();
		System.out.println("Initilization done ...");
	}
	
	@AfterEach     // execute teardown() method after each test method
	public void teardown() {
		System.out.println("Close DB connection");
		
	}
	
	@Test
	public void test1() {
		
		//create an object of a class and then execute the code
		System.out.println("Execute the test case using methods of ....JavaOperations");
	}
	
	@Test
	public void test2() {
		
		//create an object of a class and then execute the code
		System.out.println("Execute the test case using methods of ....JavaOperations");

	}
	
	

}
