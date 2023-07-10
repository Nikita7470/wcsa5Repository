package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAddtoCart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver= new ChromeDriver();//to launch browser
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");//flipkart WebApplication
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button"+"[text()='✕']")).click();//TOhandle a popUp
         Thread.sleep(2000);
         
		driver.findElement(By.xpath("//input[contains(@name,'q')]"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(""));
		
	}
	

}
