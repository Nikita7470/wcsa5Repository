package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskToSelectOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver= new ChromeDriver();//to launch browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  
		driver.get("file:///C:/Users/91747/OneDrive/Desktop/wcsa5seleniumworkspace/WebElements/SingleSelectedDropDown.html");
		
		//identify dropdown on webpage
		WebElement dropdoElement=driver.findElement(By.id("menu"));	
        
		//handle the dropDown by creating obj of select
		

		Select sel =new Select(dropdoElement);
		
		//read all the options of dropdown
	List<WebElement> allOps	=sel.getOptions();
	
	//To read List use looping statements
	
	for(WebElement op:allOps)
	{
		Thread.sleep(2000);
		op.click();
		break;
	}
	}
}

