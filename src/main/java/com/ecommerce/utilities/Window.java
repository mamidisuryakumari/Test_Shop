package com.ecommerce.utilities;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Window {
	private static Boolean bStatus;

	public static void switchToWindow(WebDriver driver, By locator) {
		String ParentWindow = driver.getWindowHandle();
		System.out.println("Parent window id is:" + ParentWindow);
		bStatus = WaitUtils.waitForWindowIsPresent(driver, locator, Constants.maxWaitTime);
		if (bStatus) {
			Elements.doClick(driver, locator);
			Set<String> windowHandles = driver.getWindowHandles();
			for (String windowHandle : windowHandles) {
				if (windowHandle != ParentWindow) {
					driver.switchTo().window(windowHandle);
					System.out.println(windowHandle);
					break;
				}
			}
		}
	}
	
	public static void switchToWindow1(WebDriver driver) {
		String ParentWindow = driver.getWindowHandle();
		System.out.println("Parent window id is:" + ParentWindow);
			Set<String> windowHandles = driver.getWindowHandles();
			for (String windowHandle : windowHandles) {
				if (windowHandle != ParentWindow) {
					driver.switchTo().window(windowHandle);
					System.out.println(windowHandle);
					break;
				}
			}
		
	}

	// close window
	public static void closeWindow(WebDriver driver, By locator) {
		driver.close();
	}
	
	//get window title
	public static void getWindowTitle(WebDriver driver, By locator) {
	String windowTitle=	driver.getTitle();
	System.out.println(windowTitle);
	}
}
