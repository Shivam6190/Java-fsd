package com.app.junitDemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

//@TestInstance is an annotation that will configure lifecycle  of tests
//It has 2 modes => Lifecycle.PER_CLAss and Lifecycle.PER_METHOD
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeforeAfterAllAnnotation {
	
	// @BeforeEach and @AfterEach are similar to TestNG @BeforeMethod @AfterMethod
	
	static JavaOperation obj;
	
	@BeforeAll   // execute the init() method only once in the beginnning of the test execution
	public void init() {  //pre condition
		System.out.println("Start DB connection");
		obj = new JavaOperation();
		System.out.println("Initilization done ...");
	}
	
	@AfterAll    // execute teardown() method will be executed only once at the end after all test execution
	public void teardown() {  // post condition
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
