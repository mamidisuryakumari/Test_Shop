package com.ecommerce.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.ecommerce.driverManager.DriverManager;

public class BaseTest {

	public static WebDriver driver;
	protected static Properties properties;
	private static String filePath = "./src/test/resources/config.properties";
	
   
	public static WebDriver setup() throws FileNotFoundException {
		if (driver == null) {
			loadProperties();
			driver = DriverManager.initializeDriver(properties.getProperty("browserName"));
			driver.get(properties.getProperty("baseUrl"));
		}
		return driver;

	}

	public static Properties loadProperties() throws FileNotFoundException {
		properties = new Properties();
		FileInputStream fileInputStream = new FileInputStream(filePath);
		try {
			properties.load(fileInputStream);
			fileInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return properties;
	}

	

}
