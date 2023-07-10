package dropDown;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
			WebDriver driver= new ChromeDriver();//to launch browser
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  
			driver.get("file:///C:/Users/91747/OneDrive/Desktop/wcsa5seleniumworkspace/WebElements/MultiSelectedDropDown.htm");	
			
			//identify dropdown
			
			WebElement dropDownElement=driver.findElement(By.id("i1"));
			
			//handle the dropdown
			Select sel=new Select(dropDownElement);
			
			//To read all selected options from dropdown
			List<WebElement> allOpts = sel.getAllSelectedOptions();
			
			//To read the list of webelement we use loop
			//for(WebElement op: allOpts)
			//{
			//	Thread.sleep(2000);
			 //System.out.println(op.getText());
			//}
			for(int i=0;i<allOpts.size();i++)
			{
				Thread.sleep(2000);
				System.out.println(allOpts.get(i).getText());
			}
	}

}
