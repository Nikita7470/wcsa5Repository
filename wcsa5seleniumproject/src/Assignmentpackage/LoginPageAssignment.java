package Assignmentpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
  WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.netflix.com/in/login");
Thread.sleep(2000);
//To identify webelement we use locators
driver.findElement(By)
	}

}
