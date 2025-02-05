package com.ecommerce.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alert {
	private static boolean bStatus;
	
	//accept alert
	public static boolean acceptAlert(WebDriver driver,By locator) {
		bStatus=WaitUtils.waitForAlertIsPresent(driver, locator, Constants.maxWaitTime);
		if(bStatus) {
			driver.switchTo().alert().accept();
			return true;
			
		}else {
			System.out.println("Alert"+locator+" was not present");
		}
		return false;
	}
//dismiss alert
	public static boolean dismissAlert(WebDriver driver,By locator) {
		bStatus=WaitUtils.waitForAlertIsPresent(driver, locator, Constants.maxWaitTime);
		if(bStatus) {
			driver.switchTo().alert().dismiss();
			return true;
			
		}else {
			System.out.println("Alert"+locator+" was not present");
		}
		return false;
	}


//get alert message
public static boolean getAlertMessage(WebDriver driver,By locator) {
	bStatus=WaitUtils.waitForAlertIsPresent(driver, locator, Constants.maxWaitTime);
	if(bStatus) {
		driver.switchTo().alert().getText();
		return true;
		
	}else {
		System.out.println("Alert"+locator+" was not present");
	}
	return false;
}
}