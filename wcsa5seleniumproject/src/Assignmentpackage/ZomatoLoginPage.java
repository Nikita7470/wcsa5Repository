package Assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
         
		//TO click on sign up link
		driver.findElement(By.linkText("sign up")).click();
		driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("phdosafghh");
		Thread.sleep(2000);
		
	}	
}






