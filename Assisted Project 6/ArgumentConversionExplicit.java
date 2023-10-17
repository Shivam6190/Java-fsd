package com.app.junitDemo;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.EnumSource;

public class ArgumentConversionExplicit {
		
	//We have created ToStringArgumentConvertor
	//This class will have a method convert(higher datatype value, target type converter)
	//Convert it to string datatype
	//TimeUnit is a Enum class storing constant data
	
	@ParameterizedTest
	@EnumSource(TimeUnit.class)
	public void testwithexplicitArgumentConversion
	(@ConvertWith(ToStringArgumentConvertor.class)String argument) {
		Assertions.assertNotNull(TimeUnit.valueOf(argument));
	}
}
