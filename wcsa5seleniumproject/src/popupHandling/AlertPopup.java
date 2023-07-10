package popupHandling;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 

	    driver.get("file:///C:/Users/91747/OneDrive/Desktop/wcsa5seleniumworkspace/WebElements/alert.html");
	    //To ganrate pop up click on button
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	   Thread.sleep(2000);
	    //handle alert pop up by using Robot class
	   //Robot robot = new Robot();
	    //robot.keyPress(KeyEvent.VK_ENTER);
	    //robot.keyRelease(KeyEvent.VK_ENTER);
	    
		//Thread.sleep(2000);
		//robot.keyPress(KeyEvent.VK_ENTER);
	    //robot.keyRelease(KeyEvent.VK_ENTER);
	    //handle alert popup using SwitchTO()
	 Alert al =driver.switchTo().alert();
	    //al.accept();
	    al.dismiss();
	    //System.out.println(al.getText());
	    
	   


	}

}
