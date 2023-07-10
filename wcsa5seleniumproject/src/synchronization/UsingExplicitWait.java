package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdiver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver =new ChromeDriver(); //launch browser
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
WebDriverWait explicitwait=new WebDriverWait(driver,Duration.ofSeconds(35));

driver.get("https://www.shoppersstack.com/");
driver.findElement(By.id("electronics")).click();
driver.findElement(By.linkText("mobiles")).click();
driver.findElement(By.xpath(""))
}

}


