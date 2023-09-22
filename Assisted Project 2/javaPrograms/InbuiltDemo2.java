package javaPrograms;

public class InbuiltDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title = "Simplilearn Online courses";
		
		// contains() method
		// this method will check if your expected string has desired set of character
		// this method will return a boolena output(true or false)
		
		//method1: using contains() method
		
		if(title.contains("Simplilearn")) {
			System.out.println("Title is valid.Test case is passed");
			
		}
		else {
			System.out.println("Title is not valid.Test case failed");
		}
		

		if(title.equals("Simplilearn Online courses")) {
			System.out.println("Title is valid.Test case is passed");
			
		}
		else {
			System.out.println("Title is not valid.Test case failed");
		}
		
		// Method substring()
		
		String title2 = "Practise Labs Java:";
		//from string title2 extract only Java
		//store it in a new string result
		
		//write condition if result equals Java - test case pass
		// else test case fail
		
		String result=title2.substring(14);
		
		if(result.equals("Java")) {
			System.out.println("Title is valid.Test case is passed");
			
		}
		else {
			System.out.println("Title is not valid.Test case failed");
		}
		
		
		
		
		
		
	}

}
