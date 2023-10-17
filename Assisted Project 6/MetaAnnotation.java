package com.app.junitDemo;

public interface MetaAnnotation {
	
	default void methodName() 
	{
		System.out.println("My name is Junit5");
	}
	
	public void method1();
	abstract void method3();

	//protected void method4(); // not allowed in an interface
}
