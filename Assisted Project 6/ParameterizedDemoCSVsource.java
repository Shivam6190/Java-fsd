package com.app.junitDemo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedDemoCSVsource {
	
	//CSV => Storing data in form of row and column -> Like an excel
	
	@ParameterizedTest(name = "Csv source {arguments}")
	@CsvSource({
		"Audi, 25",
		"BMW,  24",
		"Volvo, 45",
		"Merc, 50"
		
	})
	public void datafrom_CSVsource(String car,String quantity) {
		System.out.println(car + " : " + quantity);
	}
	
	
	
	
	
	
	

}
