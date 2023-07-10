package popupHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleActitimeFileUploadPopup {

	public static void main(String[] args) throws IOException {
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
        driver.get("http://nikita-lp/user/submit_tt.do");
       Actions act =new Actions(driver);
        WebElement uploadButton= driver.findElement(By.id("uploadfile"));
         act.doubleClick(uploadButton).perform();
         
         Runtime.getRuntime().exec("./autoITPrograms/ActitimeFileUpload.exe");
	}

}


	


