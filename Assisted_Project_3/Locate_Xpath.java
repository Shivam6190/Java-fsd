package Assisted_Project_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		
		// the below xpath will return 6 values in which if we want to have single tag selected
		// we use get(tagnumber) method
		// for this use case we also use findElements()
		
		driver.findElements(By.xpath("//input[@name='color']")).get(1).click();
		driver.findElements(By.xpath("//input[@name='color']")).get(3).click();
		

	}

}
