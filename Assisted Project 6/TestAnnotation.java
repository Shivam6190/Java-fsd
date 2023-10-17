package com.app.junitDemo;

import org.junit.jupiter.api.Test;

public class TestAnnotation {
	
	//Change the Java Library in the project if you are not getting option to run the  junit test cases
	// Right click on the project > build path > Libraries > Select JRE system Library > 
	//> Click on remove button > Click on Add library > Select JRE system Library > Click on first radio button>
	
	@Test 	// execute the below test
	public void Method1() {      // unit Test Method
		System.out.println("Hello Junit");
	}

}







