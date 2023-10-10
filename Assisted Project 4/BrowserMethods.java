package Assisted_Project_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Webdriver -- is an interface
		//chromedriver ==> implementing class fo webdriver
		WebDriver driver = new ChromeDriver();
		
		//In the browser enter url
		//For any automation on webpages -- selenium give lts of methods
		driver.get("https://www.selenium.dev/");
		// Print the title of the web page
		String title = driver.getTitle();
		System.out.println("The title of the page is: " + title);
		
		String url = driver.getCurrentUrl();
		
		System.out.println("The URL of the page is : " + url);
		
		//close the browser window
		//driver.close();
		
		

	}
}