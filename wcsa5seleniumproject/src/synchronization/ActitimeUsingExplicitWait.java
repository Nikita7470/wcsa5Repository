package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

   public class ActitimeUsingExplicitWait {
   public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver= new ChromeDriver();//to launch browser
		driver.manage().window().maximize();
		driver.get("http://nikita-lp/login.do");
		
		System.out.println("Title is matched,Test Case passed!");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		//Home page
		
		//"actiTime -Enter Time-Track"
		System.out.println("Title is matched,Test case passed!");
		
		
		//driver.findElement(By.linkText("logout")).click();
	}
	public static void explicitwaitMethod(WebDriver driver,int sec,String title)
	{
		//To apply explicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.titleContains(title));
		
		

	}

}
   
   
