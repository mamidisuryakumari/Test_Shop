package com.ecommerce.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {
	private static boolean bstatus;

	// getElement
	public static WebElement getWebElement(WebDriver driver, By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}

	// get text
	public static String getText(WebDriver driver, By locator) {
		
		WaitUtils.waitForElementIsPresence(driver, locator, Constants.maxWaitTime);
		 return driver.findElement(locator).getText();
		
		
	}

	

	// Do click
	public static boolean doClick(WebDriver driver, By locator) {
		bstatus = WaitUtils.waitForElementToBeClickable(driver, locator, Constants.maxWaitTime);
		if (bstatus) {
			getWebElement(driver, locator).click();
			return true;
		} else {
			System.out.println("Locator " + locator + " was not avilable for click");
		}
		return false;
	}

	// Do JSclick
	public static boolean doJsClick(WebDriver driver, By locator) {
		bstatus = WaitUtils.waitForElementToBeClickable(driver, locator, Constants.maxWaitTime);
		if (bstatus) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();" + getWebElement(driver, locator));
			return true;
		} else {
			System.out.println("Locator" + locator + " was not avilable for click" + locator);
		}
		return false;
	}

	// Do sendKeys
	public static boolean doSendKeys(WebDriver driver, By locator, String inputText) {
		bstatus = WaitUtils.waitForElementIsVisible(driver, locator, Constants.maxWaitTime);
		if (bstatus) {
			getWebElement(driver, locator).sendKeys(inputText);
			return true;
		} else {
			System.out.println("TextField " + locator + " was not present");
			return false;
		}

	}

	// Do JsSendKeys
	public static boolean doJsSendKeys(WebDriver driver, By locator, String inputText) {
		bstatus = WaitUtils.waitForElementIsVisible(driver, locator, Constants.maxWaitTime);
		if (bstatus) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].value=arguments[1];" + getWebElement(driver, locator), inputText);
			return true;
		} else {
			System.out.println("TextField " + locator + " was not present:" + locator);
			return false;
		}

	}
	// check box selected

	public static boolean selectCheckbox(WebDriver driver, By locator) {
		bstatus = WaitUtils.waitForElementToBeSelected(driver, locator, Constants.maxWaitTime);
		if (!bstatus) {
			doClick(driver, locator);
			return true;
		} else {
			System.out.println("Checkbox" + locator + " was not present:" + locator);
			return false;
		}

	}
	// check box unselected

	public static boolean unSelectCheckbox(WebDriver driver, By locator) {
		bstatus = WaitUtils.waitForElementToBeSelected(driver, locator, Constants.maxWaitTime);
		if (bstatus) {
			doClick(driver, locator);
			return true;
		} else {
			System.out.println("Checkbox" + locator + " was not present");
			return false;
		}

	}
}
