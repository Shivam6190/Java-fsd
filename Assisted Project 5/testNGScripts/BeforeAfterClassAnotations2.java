package com.app.testNGScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterClassAnotations2 {
	
	// precondition methods, they are not test methods
	
			@BeforeClass     //Executes before every test method
			public void login() {
	
				System.out.println("log into gmail");
			}
			
			//priority determines the sequence in which we have to run the test methods in the class
			@Test(priority = '1') // this is a test method
			public void ComposeEmail() {
				System.out.println("Steps to compose the email");
			}
			
			@Test(priority= '2')
			public void SearchEmail() {
				System.out.println("Steps to search the email");
			}
			
			@Test(priority= '3')
			public void DeleteEmail() {
				System.out.println("Steps to delete email");
			}
			
			@AfterClass     // Executes after every test method
			public void logout() {
				
				System.out.println("Close the browser");
			}
		


}
