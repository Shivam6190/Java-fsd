package Assisted_Project_3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//step 1: open the browser
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ANew+account");

		boolean displayed = driver.findElement(By.id("wpName2")).isDisplayed();
		System.out.println("Element is displayed ?" + displayed);
		
		boolean enabled = driver.findElement(By.id("wpName2")).isEnabled();
		System.out.println("Element is displayed ?" + enabled);
		
		//Inspect the element using ID locator and enter text in it
		//sendKeys("inputValue")
		
		driver.findElement(By.id("wpName2")).sendKeys("admin");
		
		
		
		
		//When you have multiple actions to be done on the same element then you can store the locator value in an object of type WebElement
		
		WebElement password = driver.findElement(By.id("wpPassword2"));
		
		displayed=password.isDisplayed();
		System.out.println("Element is displayed ?" + displayed);
		password.isEnabled();
		System.out.println("Element is displayed ?" + enabled);
		password.sendKeys("admin@123");
		
		
		
		
		
		//Continue further and find element using name locator
		
		WebElement confirm = driver.findElement(By.name("retype"));
		
		confirm.isDisplayed();
		confirm.isEnabled();
		confirm.sendKeys("admin@123");
		
		
		
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("admin@gmail.com");
		
		
		
		
		
	}

}
