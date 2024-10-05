package com.ecommerce.utilities;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Verify {

	// Element visible
	public static boolean verifyElementIsVisible(WebDriver driver, By locator) {
		try {
			WebElement element = driver.findElement(locator);
			return element.isDisplayed();
		} catch (NoSuchElementException e) {
			System.err.println("Element "+locator+" is not found") ;
		} catch (Exception e) {
			System.err.println("An error occurred while checking visibility: " + e.getMessage());
		}
		return false;
	}

	//Element selected
	public static boolean verifyElementIsSelected(WebDriver driver, By locator) {
		try {
			WebElement element = driver.findElement(locator);
			return element.isSelected();
		} catch (NoSuchElementException e) {
			System.err.println("Element "+locator+" is not selected");
		} catch (Exception e) {
			System.err.println("An error occurred while checking selecting : " + e.getMessage());
		}
		return false;
	}

	//Element enabled
	public static boolean verifyElementIsEnabled(WebDriver driver, By locator) {
		try {
			WebElement element = driver.findElement(locator);
			return element.isEnabled();
		} catch (NoSuchElementException e) {
			System.err.println("Element "+locator+"is not enabled: " + locator);
		} catch (Exception e) {
			System.err.println("An error occurred while checking enabling : " + e.getMessage());
		}
		return false;
	}
	
}
