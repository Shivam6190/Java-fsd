package com.app.junitDemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// for @Order annotation to be implemented in Junit, we have to also use @TestMethodOrder

/*MethodOrderer that sorts methods based on the @Orderannotation. 

Any methods that are assigned the same order value will be sortedarbitrarily adjacent to each other. 

Any methods not annotated with @Order will be assigned the default order value which will effectively 
cause themto appear at the end of the sorted list, unless certain methods are assignedan explicit order 
value greater than the default order value. Any methodsassigned an explicit order value greater than the default order value willappear 

 */

//@TestMethodOrder(MethodOrderer.Random.class) run test randomly and not in an order

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DisplayNameOrderAnnotation {
	
	//@Test(priority similar to order)
	
	//A method with no @order annotation will get executed at the end
	@Order(4)
	@DisplayName("SignIn Button")
	@Test
	public void method1() {
		System.out.println("Testing Login Feature");
	}
	
	@Order(1)
	@DisplayName("Username Field")
	@Test
	public void method2() {
		System.out.println("Testing Username");
	}

	@Order(2)
	@DisplayName("Password Field")
	@Test
	public void method3() {
		System.out.println("Testing Password Field");
	}

	@Order(3)
	@DisplayName("Forget Password Field")
	@Test
	public void method4() {
		System.out.println("Testing Forget Password Field");
	}

}
