package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLaunchFirefoxBrowser {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.Firefox.driver","./drivers/geckodriver.exe");
		
		
new FirefoxDriver();
}
}
