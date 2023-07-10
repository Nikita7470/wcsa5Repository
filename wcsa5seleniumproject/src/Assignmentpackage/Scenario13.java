package Assignmentpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver= new ChromeDriver();//to launch browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  
		driver.get("https://www.bluestone.com");	
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		driver.findElement(By.xpath("//span[text()='Offer']")).click();
		//driver.findElement(By.xpath("//span[text()='"));
		

		

	}

}
