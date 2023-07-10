package dropDown;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver= new ChromeDriver();//to launch browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  
		driver.get("file:///C:/Users/91747/OneDrive/Desktop/wcsa5seleniumworkspace/WebElements/SingleSelectedDropDown.html");	
		WebElement MultiselectDD=driver.findElement(By.id("menu"));		
        Select sel = new Select(MultiselectDD);
         //To select using index
        sel.selectByIndex(2);
        
        
        //To select using visible text
        //sel.selectByVisibleText("vada pav");
        
        
        //To using value
        sel.selectByValue("v5");       
}
}

