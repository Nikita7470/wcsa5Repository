package Assignmentpackage;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminatesDuplicates {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver= new ChromeDriver();//to launch browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  
		driver.get("file:///C:/Users/91747/OneDrive/Desktop/wcsa5seleniumworkspace/WebElements/MultiSelectedDropDown.html");
		//identify drodown
		WebElement dropDownElement=driver.findElement(By.id("i1"));
		
		//handle the dropdown
		 Select sel=new Select(dropDownElement);
		 
		 HashSet<String> hs=new HashSet<String>();
		 
		 //To get operation from dropdown
		List<WebElement> allOpts =sel.getOptions();
		//to read options from dropdown
		for(int i=0;i<allOpts.size();i++)
				{
					WebElement op=allOpts.get(i);
					String value=op.getText();
					hs.add(value);
					//Read the value from set
					for(String element:hs)
					{
						Thread.sleep(2000);
						System.out.println(element);
					}
					
					
				}
	
				

	}

}
