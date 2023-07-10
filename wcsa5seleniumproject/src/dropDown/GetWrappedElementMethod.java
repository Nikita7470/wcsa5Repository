package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver= new ChromeDriver();//to launch browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  
		driver.get("file:///C:/Users/91747/OneDrive/Desktop/wcsa5seleniumworkspace/WebElements/MultiSelectedDropDown.htm");	
		
		//identify dropdown
		
		WebElement dropDownElement=driver.findElement(By.id("i1"));
		
		//handle the dropdown
		Select sel=new Select(dropDownElement);
		
		//To read options from dropDown
		WebElement allopts=sel.getWrappedElement();
		
		System.out.println(allopts.getText());


	}

}
