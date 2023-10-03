package in.amazon_phase1_endProject;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSearchMobilePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		// wait for 2 seconds for the page to load
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("https://www.amazon.com/");
		
		//Inspect the search box and enter the input as iPhone13
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone13");
		driver.findElement(By.id("twotabsearchtextbox")).submit();
		
		Thread.sleep(1500);
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1500);
		driver.findElement(By.id("wishlistButtonStack")).click();
		
		driver.quit();
		
		

	}

}
