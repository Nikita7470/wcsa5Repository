package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver= new ChromeDriver();//to launch browser
		//maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		//launch the webApplication
		driver.get("https://www.bluestone.com/");
		
		//handle hidden division pop up
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		//identify frame by using xpath
		WebElement frameElement=driver.findElement(By.xpath("iframe[@id='fc_widget']"));
		
		//handle the frame by switch the controls to frame...
		//driver.switchTo().frame(5); //handle frame by using index
		driver.switchTo().frame("fc_widget");//handle frame by using nameOrId.
		driver.switchTo().frame(frameElement);
		
		WebElement chatBox=driver.findElement(By.id("chat-icon"));
		chatBox.click();
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='chat-icon']"))).click();
		
        //switch to controls again back to the main webPage..
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-name")).sendKeys("Nikkita");
		driver.findElement(By.id("chat-fc-email")).sendKeys("nikki@123");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("9999999999");
	}
}
