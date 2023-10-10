package com.app.testNGScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo2 {
	
	@Test
	public void method1() {
		String expectedresult = "selenium";
		String actualresult = "selenium tools";
		
		
		//assertNotEquals: It will check if 2 strings are not equal => true => test passes
		//return false = test stops -> assertion error
		Assert.assertNotEquals(expectedresult,actualresult);
	}
	
	@Test
	public void method2() {
	String actualresult = "selenium";
	//If the string has null value from the webpage, then throw an assertion.
	
	Assert.assertNull(actualresult);
	}
	
}
