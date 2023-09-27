package exceptionPractises;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int i = 9;
		int j = 0;
		
		//Handle the exception
		//can be done using try and catch block
		// try and catch will occur together
		// finally is not mandatory. If you have statements that have to compulsory executed in a program
		try {
			System.out.println("Result" + i/j);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Result " + i+j);
			System.out.println("Result " + i*j);
			System.out.println("Result " + (i-j));
			
		}
		

	}

	

}
