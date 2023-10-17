package com.app.junitDemo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


//write @Disabled annotation at the class method
//All the test methods in this class will be skipped or not executed

//@Disabled("Functionalty is not working, ignoring the tests")
public class DisaabledTests {
	
static JavaOperation obj;
	

	@Test
	public void method1() {
		
		//create an object of a class and then execute the code
		System.out.println("Executing method 1 of code class");
	}
	
	@Test
	@Disabled     //only this method is skipped
	public void method2() {
		
		//create an object of a class and then execute the code
		System.out.println("Executing method 2 of code class");

	}
	
	@Test
	@Disabled 	  //only this method is skipped
	public void method3() {
		
		//create an object of a class and then execute the code
		System.out.println("Executing method 3 of code class");

	}
	
	@Test
	public void method4() {
		
		//create an object of a class and then execute the code
		System.out.println("Executing method 4 of code class");

	}
	
	
	
	

}
