package com.ecommerce.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownUtil {
	private static boolean bstatus;

	// Select By value
	public static boolean selectByValue(WebDriver driver, By locator, String value) {
		bstatus = WaitUtils.waitForElementIsVisible(driver, locator, Constants.maxWaitTime);
		if (bstatus) {
			Select select = new Select(Elements.getWebElement(driver, locator));
			select.selectByValue(value);
			return true;
		} else {
			System.err.println("Dropdown " + locator + " was not present.");
			return false;
		}
	}
	// Select By visibleText
		public static boolean selectByVisibleText(WebDriver driver, By locator, String text) {
			bstatus = WaitUtils.waitForElementIsVisible(driver, locator, Constants.maxWaitTime);
			if (bstatus) {
				Select select = new Select(Elements.getWebElement(driver, locator));
				select.selectByVisibleText(text);
				return true;
			} else {
				System.err.println("Dropdown " + locator + " was not present.");
				return false;
			}
		}
		// Select By index
		public static boolean selectByIndex(WebDriver driver, By locator, int index) {
			bstatus = WaitUtils.waitForElementIsVisible(driver, locator, Constants.maxWaitTime);
			if (bstatus) {
				Select select = new Select(Elements.getWebElement(driver, locator));
				select.selectByIndex(index);
				return true;
			} else {
				System.err.println("Dropdown " + locator + " was not present.");
				return false;
			}
		}
}
