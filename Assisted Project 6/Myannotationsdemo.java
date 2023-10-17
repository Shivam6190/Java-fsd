package com.app.junitDemo;

import java.lang.annotation.Annotation;

public class Myannotationsdemo implements MetaAnnotaion2 {

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@MetaAnnotaion2
	public void testannotation() {
		System.out.println("This method is executed by my Annotation");
	}




}
