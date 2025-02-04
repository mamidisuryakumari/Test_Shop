package com.ecommerce.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Elements {
	private static boolean bStatus;
	private static Logger logger = LoggerFactory.getLogger(Elements.class);

	// getElement
	public static WebElement getWebElement(WebDriver driver, By locator) {
		try {
			WebElement element = driver.findElement(locator);
			return element;
		} catch (Exception e) {

		}
		return null;

	}

	// get text
	public static String getText(WebDriver driver, By locator) {

		WaitUtils.waitForElementIsPresence(driver, locator, Constants.maxWaitTime);
		return driver.findElement(locator).getText();

	}

	// move to element
	public static boolean moveToElement(WebDriver driver, By locator) {
		if (driver == null || locator == null) {
			logger.error("Driver or locator is null. Driver: {}, Locator: {}", driver, locator);
			return false;
		}
		try {
			bStatus = WaitUtils.waitForElementIsVisible(driver, locator, Constants.maxWaitTime);
			if (bStatus) {
				WebElement element = getWebElement(driver, locator);
				Actions actions = new Actions(driver);
				actions.moveToElement(element).perform();
				logger.info("Successfully moved to the element: {}", locator);
				return true;
			} else {
				logger.warn("Element {} was not visible within the maximum wait time.", locator);
				return false;
			}
		} catch (Exception e) {
			logger.error("Exception occurred while moving to the element: {}", locator, e.getMessage());
			return false;
		}
	}

	// Do click
	public static boolean doClick(WebDriver driver, By locator) {
		try {
			bStatus = WaitUtils.waitForElementToBeClickable(driver, locator, Constants.maxWaitTime);
			if (bStatus) {
				getWebElement(driver, locator).click();
				logger.info("Successfully clicked to the element {} :", locator);
				return true;
			} else {
				logger.warn("Element {} was not available for click", locator);
				return false;
			}
		} catch (Exception e) {
			logger.error("Exception occurred while trying to click the element: {}.Exception:{}", locator, e.getMessage());
			return false;
		}
	}

	// Do JSclick
	public static boolean doJsClick(WebDriver driver, By locator) {
		try {
			bStatus = WaitUtils.waitForElementToBeClickable(driver, locator, Constants.maxWaitTime);
			if (bStatus) {
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();" + getWebElement(driver, locator));
				logger.info("Successfully clicked to the element {} :", locator);
				return true;
			} else {
				logger.warn("Element {} was not available for click", locator);
				return false;
			}
		} catch (Exception e) {
			logger.error("Exception occurred while trying to click the element: {}", locator, e.getMessage());
			return false;
		}
	}

	// Do sendKeys
	public static boolean doSendKeys(WebDriver driver, By locator, String inputText) {
		try {
			boolean bStatus = WaitUtils.waitForElementIsVisible(driver, locator, Constants.maxWaitTime);
			if (bStatus) {
				WebElement element = getWebElement(driver, locator);
				element.sendKeys(inputText);
				logger.info("Successfully entered text '{}' into the element: {}", inputText, locator);
				return true;
			} else {
				logger.warn("Element {} was not visible for entering text '{}'.", locator, inputText);
				return false;
			}
		} catch (Exception e) {
			logger.error("Exception occurred while entering text '{}' into the element: {}", inputText, locator,
					e.getMessage());
			return false;
		}
	}

	// Do JsSendKeys
	public static boolean doJsSendKeys(WebDriver driver, By locator, String inputText) {
		try {
			bStatus = WaitUtils.waitForElementIsVisible(driver, locator, Constants.maxWaitTime);
			if (bStatus) {
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].value=arguments[1];" + getWebElement(driver, locator), inputText);
				logger.info("Successfully entered text {} into the element {}", inputText, locator);
				return true;
			} else {
				logger.warn("Element {} was not visible for entering text '{}'.", locator, inputText);
				return false;
			}
		} catch (Exception e) {
			logger.error("Exception occurred while entering text '{}' into the element: {}", inputText, locator,
					e.getMessage());
			return false;
		}
	}
	// check box selected

	public static boolean selectCheckbox(WebDriver driver, By locator) {
		try {
			bStatus = WaitUtils.waitForElementToBeSelected(driver, locator, Constants.maxWaitTime);
			if (!bStatus) {
				doClick(driver, locator);
				logger.info("Checkbox {} was successfully selected.", locator);
                return true;
			} else {
				logger.warn("Failed to click the checkbox {}",locator);
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
	// check box unselected

	public static boolean unSelectCheckbox(WebDriver driver, By locator) {
		bStatus = WaitUtils.waitForElementToBeSelected(driver, locator, Constants.maxWaitTime);
		if (bStatus) {
			doClick(driver, locator);
			return true;
		} else {
			System.out.println("Checkbox" + locator + " was not present");
			return false;
		}

	}

	public static boolean doSendKeysWithTab(WebDriver driver, By locator, String inputText) {

		try {
			boolean isVisible = WaitUtils.waitForElementIsVisible(driver, locator, Constants.maxWaitTime);
			if (isVisible) {
				WebElement element = getWebElement(driver, locator);
				element.sendKeys(inputText, Keys.TAB); // Send input text followed by Tab
				logger.info("Successfully sent keys '{}' with Tab to the element: {}", inputText, locator);
				return true;
			} else {
				logger.warn("Element {} was not visible within the maximum wait time.", locator);
				return false;
			}
		} catch (Exception e) {
			logger.error("Exception occurred while sending keys '{}' with Tab to the element: {}", inputText, locator,
					e.getMessage());
			return false;
		}
	}

}
