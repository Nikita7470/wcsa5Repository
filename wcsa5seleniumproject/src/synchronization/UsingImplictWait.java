package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingImplictWait {

	public static void main(String[] args) {
	
		System.setProperty("webDriver.chrome.driver","./drivers.chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com");
		
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("lord_ganesha20gmail.com"); //username
		
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("abc@123"); //password cssSelector
		
		driver.findElement(By.xpath("//button[contains(@class,'_acan _acap _acas _aj1-')]")).click();//Login button
		
		
	}

}
