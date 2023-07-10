package actionClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {

	public static void main(String[] args) throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
			WebDriver driver= new ChromeDriver();//to launch browser
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  
			driver.get("file:///C:/Users/91747/OneDrive/Desktop/wcsa5seleniumworkspace/WebElements/SingleSelectedDropDown.html");
			WebElement target= driver.findElement(By.id("menu"));
			
			//To perform right click
			
       Actions act= new Actions(driver);
       Thread.sleep(3000);
       act.contextClick(target).perform();
	}

}
