package inheritanceDemo;

public class Base {
	
	// This is going to my parent class
	
	public void openbrowser(String browser) {
		
		System.out.println("Opne the chrome browser" + browser);
		
	}
	
	public static void login(String username, String password) {
		System.out.println("Enter Username: " + username);
		System.out.println("Enter Password: " + password);
		System.out.println("Sign into mailbox");
		
	}
	//Static: this method can be called without an object in any class.
	
	public void logout() {
		System.out.println("Click on logout button");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
