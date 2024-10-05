package com.ecommerce.driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	private static 	WebDriver driver;
	
	public static WebDriver initializeDriver(String browserName) {
	
		
		switch(browserName.toLowerCase()) {
		case "chrome" :
			driver = new ChromeDriver();
			break;
			
		case "edge" :
			driver = new EdgeDriver();
			break;
			
		case "safari" :
			driver = new SafariDriver();
			break; 
			
		case "firefox" :
			driver = new FirefoxDriver();
			break;
			
			default:
				throw new IllegalArgumentException("Browesr name is invalid :" +browserName );
		}
		driver.manage().window().maximize();
		return driver;
	}

}
