package Assisted_Project_3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(1400);
		
		//We will not make driver object to switch from main window of app to get alert window
		//Once we switch to alert we will use Alert Class object to perform action on the alert
		//We can perform 3 actions on the alert : getText
		
		
		Alert a = driver.switchTo().alert();
		
		String alertText = a.getText();
		System.out.println(alertText);
		
		a.accept();
		
		//If you want to press on cancel on NO button a.dismiss();
		//After this use driver object to enter username and password on the text below
		
		driver.findElement(By.id("login1")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		

	}

}
