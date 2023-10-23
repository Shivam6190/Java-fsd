package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "C:\\Users\\SHIVAM SINGH\\eclipse-workspace\\Lesson5-CucumberDemo\\src\\main\\java\\features\\wikipage.feature",
	glue= {"steps"},
	plugin= {"html:target/Cucumberreport.html",
			 "pretty",
			 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			 "timeline:test-output-thread/"		
	},
	
	monochrome = true, // console output will be in more readable format
	tags = "@login"
		
		)


public class TestRunner1 {

}

