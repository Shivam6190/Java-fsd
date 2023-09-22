package inheritanceDemo;

public class Payments extends Homepage {
	
	// this class is child to homepage and grandchild to base class
	//this is multilevel inheritance
	
	public void payments() {
		System.out.println("test payments page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payments obj = new Payments();
		obj.openbrowser("Chrome");  	// Base Class
		login("admin","admin123");	// Base Class
		obj.Homepagetest();				// Homepage Class
		obj.payments();					// Current Class
		obj.logout();					// Base Class

	}

}
