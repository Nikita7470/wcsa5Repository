package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
        driver.get("file:///C:/Users/91747/OneDrive/Desktop/wcsa5seleniumworkspace/WebElements/Confirmation.html");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);
        
        //handle confirmation pop up
       Alert al=driver.switchTo().alert();
       // al.accept();
        al.dismiss();
        
	}

}
