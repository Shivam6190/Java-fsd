package exceptionPractises;

import java.util.InputMismatchException;

public class ThrowskeywordDemo {
	

	public void div(int a, int b) throws ArithmeticException {
		//let us assume ArithmeticException class is our custom experience class
		//throw keyword creates an exception of your choice and throw it in a method
		// throws keyword indicates that current method may throw an error
		
		if(b==0) {
			throw new ArithmeticException();
		}
		else {
		int c = a/b;
		System.out.println("The divison of 2 number is : " + c);
		}
	}


	public static void main(String[] args)throws ArithmeticException {
		// TODO Auto-generated method stub
		ThrowskeywordDemo obj = new ThrowskeywordDemo();
		try {
			obj.div(12,0 );
			
		}
		catch(Exception e){
			System.out.println("further code execution");
			
		}
		
		
		

	}

}
