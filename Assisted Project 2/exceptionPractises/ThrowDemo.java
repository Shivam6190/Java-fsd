package exceptionPractises;

import java.util.InputMismatchException;

public class ThrowDemo {
	
	public void div(int a, int b) {
		//let us assume ArithmeticException class is our custom experience class
		//throw keyword is used for giving custom exception when the method is caleed and it fails
		
		if(b==0) {
			throw new InputMismatchException();
		}
		else {
		int c = a/b;
		System.out.println("The divison of 2 number is : " + c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowDemo obj = new ThrowDemo();
		obj.div(12, 0);
		

	}

}
