package exceptionPractises;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 9;
		int j = 0;
		
		//Handle the exception
		//can be done using try and catch block
		
		try {
			System.out.println("Result" + i/j);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Please don't give 0");
		}
		
		
		System.out.println("Result " + i+j);
		System.out.println("Result " + i*j);
		System.out.println("Result " + (i-j));

	}

}
