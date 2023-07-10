package popupHandling;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopup {
static WebDriver driver;
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter BrowserValue!");
		String browserValue=sc.next();
		if (browserValue.equalsIgnoreCase("chrom"))
		{
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
		//handle notification popup
	ChromeOptions co =new ChromeOptions();
	co.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//apply implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.easemytrip.com/");
	}
	else if(browserValue.equalsIgnoreCase("Firefox"))
	{
		System.setProperty("webDriver.gecko.driver","./drivers/geckodriver.exe");		FirefoxOptions fo= new FirefoxOptions();
		fo.addArguments("--disable-notifications");
		driver=new FirefoxDriver();
	driver.manage().window().maximize();
		//apply implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.easemytrip.com/");
		}
	else if(browserValue.equalsIgnoreCase("Edge"))
	{
		System.setProperty("webDriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeOptions eo=new EdgeOptions();
		eo.addArguments("--disable-notifications");
		driver=new EdgeDriver();	
		driver.manage().window().maximize();
		//apply implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.easemytrip.com/");
	
	}
	else
{
		System.out.println("Enter valid browserValue!");
	}
}
}

