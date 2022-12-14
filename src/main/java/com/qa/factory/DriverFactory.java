package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
			
	public WebDriver init_driver(String browser) {
		
		System.out.println("browser value is:" + browser);
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			//tlDriver.set(new ChromeDriver());
			ChromeOptions options = new ChromeOptions();
			options.setHeadless(true);
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-dev-shm-usage");
			tlDriver.set(new ChromeDriver(options));
		}
		else if(browser.equals("chrome")) {
		WebDriverManager.firefoxdriver().setup();
		tlDriver.set(new FirefoxDriver());
		}
		else {
		  System.out.println("Please pass the correct browser value: " + browser);	
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}		
	
	
	public static WebDriver getDriver() {
		return tlDriver.get();
	}
}
