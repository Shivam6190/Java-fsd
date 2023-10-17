package com.app.junitDemo;

import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ArgumentConvertionImplicit {
	
	// Junit will automatically convert the data type of input source into desired datatype by test method
	// Source = String
	// Implict convert to TimeUnit
	
	@ParameterizedTest
	@ValueSource(strings = "SECONDS")  // input data source as String.
	public void testwithImplicitArgumentConversion(ChronoUnit chronoUnit) {	//method expects a timeUnit
		
		System.out.println(chronoUnit.name());
		Assertions.assertNotNull(chronoUnit.name());
	}
}
