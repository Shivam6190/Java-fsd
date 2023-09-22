package inheritanceDemo;

public class MethodsDemo {
	
	public void login() {
		System.out.println("Enter user name");
		System.out.println("Enter Password");
		System.out.println("Enter into mailbox");
		
	}
	
	public void ComposeEmail() {
		System.out.println("Compose an Email");
		
	}
	
	public void logout() {
		System.out.println("Click on logout button");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create java class object
		
		MethodsDemo obj = new MethodsDemo();
		
		//call the method created in the class
		
		obj.login();
		
		obj.ComposeEmail();
		
		obj.logout();

	}

}
