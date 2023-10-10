package com.app.TestNGExtentreports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SetUpCheck {
	
//	@Test
//	
//	public void extenddemo() {
//		// create an onbject to initiate Extend report engine
//		ExtentReports ex = new ExtentReports();
//		//initiate extend report reporter --> SparkReporter
//		
//		//give the path of the folder in which extend report has to be created
//		//Right click on properties --> properties --> Go to resources on left --> copy the path of the project.
//		ExtentSparkReporter sparkreporter = new ExtentSparkReporter("C:\\Users\\SHIVAM SINGH\\eclipse-workspace\\TestNg2phase2");
//		
//		
//		//Attach ExtendReports object to ExtendSparkReporter Object
//		ex.attachReporter(sparkreporter);
//		ex.flush();  //generates report in the given location
//		
//	}
	
	//OR
	

	@Test
	public void extentDemo2() throws IOException
	{
		ExtentReports ex = new ExtentReports();
		File file = new File("report1.html");
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter(file);
		ex.attachReporter(sparkreporter);
		ex.flush(); 
		
		// automatically open the report for you on your desktop browser
		Desktop.getDesktop().browse(new File("report1.html").toURI());
		
	}
}
