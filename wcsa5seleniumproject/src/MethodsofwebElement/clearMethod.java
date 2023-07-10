package MethodsofwebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearMethod {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
			WebDriver driver= new ChromeDriver();//to launch browser
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://desktop-aigvo6j/login.do");

			WebElement usnTB=driver.findElement(By.name("username"));
			WebElement passTB=driver.findElement(By.name("pwd"));
			
			usnTB.sendKeys("admin");
			passTB.sendKeys("MANAGER");
			Thread.sleep(2000);
			usnTB.clear();
			passTB.clear();
	}
}
