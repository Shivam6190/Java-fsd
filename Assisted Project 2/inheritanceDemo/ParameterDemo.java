package inheritanceDemo;

public class ParameterDemo {
	
	//Pass value to your methods
	// methods with parameters
	
	public void login(String username, String password) {
		System.out.println("Enter Username: " + username);
		System.out.println("Enter Password: " + password);
		System.out.println("Enter into mailbox");
		
	}
	
	public void ComposeEmail(String text) {
		System.out.println("Compose an Email: " + text);
		
	}
	
	public void logout() {
		System.out.println("Click on logout button");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterDemo obj = new ParameterDemo();
		
		obj.login("shivam","admin@123");
		obj.ComposeEmail(("Hello"));
		obj.login("admin","admin123");
		obj.ComposeEmail("Hi");
		obj.logout();
		

	}

}
