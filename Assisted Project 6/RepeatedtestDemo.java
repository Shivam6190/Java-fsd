package com.app.junitDemo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedtestDemo {
	
	//we will not use @TestAnnotation
	
	@RepeatedTest(3)
	//execute the test 3 times
	@DisplayName("repeatedtests")
	public void repeatmessage() {
		System.out.println("We are learning Junit");
	}
	
	@Test
	public void AssumptionsDemo() {
		
		//I want to run testcase only if my server is up and running
		boolean isDBServerUp = true;
		
		Assumptions.assumeTrue(isDBServerUp,"server is not up");
		System.out.println("Create tables and inner data");
		
		
	}
	

}
