package MethodsOfWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class closeMethod {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
		new ChromeDriver();
	
      ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.close();
	}

}




