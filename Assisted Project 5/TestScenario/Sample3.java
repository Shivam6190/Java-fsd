package TestScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample3 {
	
	
WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	// by default every test method is enable=true
	
	@Test(priority='1',enabled=false)
	public void GetTitle()   // Called as a Test Method
	{
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}
	
	@Test (priority='2',enabled=true)
	public void login() throws InterruptedException
	{
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumdemo@gmail.com");
	}
	
	
}