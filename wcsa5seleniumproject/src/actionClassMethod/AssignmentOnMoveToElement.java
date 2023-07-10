package actionClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnMoveToElement {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver= new ChromeDriver();//to launch browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  
		driver.get("https://www.bluestone.com");
		 driver.findElement(By.id("denBtn")).click();
		 driver.findElement(By.xpath("//a[text()='coins ']"));
		 
		Actions act=new Actions(driver);
		act.moveToElement(targetcoins).perform();
		driver.findElement(By.xpath(//))
	}

	}


