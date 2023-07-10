package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRight {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver= new ChromeDriver();//to launch browser
		//maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		 driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		//To perform Scrolling Oprations
				JavascriptExecutor jse=(JavascriptExecutor)driver;
				jse.executeScript("alret("Hello There!"),");
				//To handle Disable webElement
				jse.executeScript("");
				Thread.sleep(2000);

			}


	}

}
