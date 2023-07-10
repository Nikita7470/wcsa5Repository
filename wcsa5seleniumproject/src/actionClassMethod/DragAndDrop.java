package actionClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver= new ChromeDriver();//to launch browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement src1=driver.findElement(By.xpath("  //a[text()=' SALES ']"));
         WebElement target1 = driver.findElement(By.xpath(""));
 
         WebElement src2=driver.findElement(By.xpath("  //a[text()=' BANK ']"));
         WebElement target2 = driver.findElement(By.xpath(""));
 
         WebElement src3=driver.findElement(By.xpath("  //a[text()=' 5000 ']"));
         WebElement target3 = driver.findElement(By.xpath(""));
 
         WebElement src4=driver.findElement(By.xpath("  //a[text()=' 5000 ']"));
         WebElement target4 = driver.findElement(By.xpath(""));
 
	}

}
