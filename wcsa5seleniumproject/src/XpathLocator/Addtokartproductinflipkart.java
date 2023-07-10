package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtokartproductinflipkart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("hp laptop");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//butto"+"n[text()='✕']")).click();//TOhandle a popUp
         Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'L0Z3Pu')]"));
        Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text() ='HP 247 G8 Athlon Dual Core - (8 GB/1 TB HDD/Windows 11 Home) 247 G8 Notebook Notebook']/../..//div[text()='₹23,890']"));
		

	}

}
