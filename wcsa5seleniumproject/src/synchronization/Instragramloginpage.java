package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instragramloginpage {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webDriver.chrome.driver","./drivers.chromedriver");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com");

driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("lord_ganesha20gmail.com"); //username

driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("abc@123"); //password cssSelector

driver.findElement(By.xpath("//button[contains(@class,'_acan _acap _acas _aj1-')]")).click();//Login button

}
}










