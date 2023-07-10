package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillparticularWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver= new ChromeDriver();//to launch browser
		//maximize the browser
		driver.manage().window().maximize();
		//
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		driver.get("https://www.selenium.dev");
		WebElement newsElement=driver.findElement(By.xpath("//h2[text()='News']"));
		//To perform scrolling operation for a newsElement
		//loaction of newsElement
		Point loc=newsElement.getLocation();
		int xaxis=loc.getX();
		int yaxis=loc.getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
        jse.executeScript("window.scrollBy(5000,0)");
	}
	

}
