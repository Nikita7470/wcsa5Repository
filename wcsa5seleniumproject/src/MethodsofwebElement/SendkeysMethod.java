package MethodsofwebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysMethod {

	public static void main(String[] args) {
		//It is use to send inputs to text box and active element
	
				System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
				WebDriver driver= new ChromeDriver();//to launch browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				//identify webelement and use methods of webelement
				//WebElement usnTB= driver.finElement(By."username"));
				//usnTB.sendKeys("Admin");
            driver.findElement(By.name("usrname")).sendKeys("Admin");
	}

}


