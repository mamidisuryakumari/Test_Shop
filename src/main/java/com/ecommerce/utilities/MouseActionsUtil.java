package com.ecommerce.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MouseActionsUtil {
	private static boolean bstatus;
	static WebDriver driver;
	private static final Logger logger = LoggerFactory.getLogger(MouseActionsUtil.class);


	//move to element
	
	public static boolean moveToElement(WebDriver driver, By locator) {
		bstatus=WaitUtils.waitForElementIsPresence(driver, locator, Constants.maxWaitTime);
		if(bstatus) {
	    Actions actions = new Actions(driver);
	    WebElement element = driver.findElement(locator);
	    actions.moveToElement(element).perform();
	    return true;
	}else {
		return false;
	}
	
	}
	
	public static void moveToElementAndClick(WebDriver driver, By locator) {
	    try {
	        WebElement element = driver.findElement(locator);
	        Actions actions = new Actions(driver);
	        actions.moveToElement(element).click().perform();
	        logger.info("Moved to and clicked element: {}", locator);
	    } catch (Exception e) {
	        logger.error("Failed to move and click element {}. Exception: {}", locator, e.getMessage());
	    }
	}
	
	public static void moveToElementJS(WebDriver driver, By locator) {
	    try {
	        WebElement element = driver.findElement(locator);
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	        logger.info("Moved to element using JavaScript: {}", locator);
	    } catch (Exception e) {
	        logger.error("Failed to move to element using JavaScript {}. Exception: {}", locator, e.getMessage());
	    }
	}
	
   // Right-Click (Context Click) on an Element
	
	public static void rightClick(WebDriver driver, By locator) {
	    try {
	        WebElement element = driver.findElement(locator);
	        Actions actions = new Actions(driver);
	        actions.contextClick(element).perform();
	        logger.info("Right-clicked on element: {}", locator);
	    } catch (Exception e) {
	        logger.error("Failed to right-click on element {}. Exception: {}", locator, e.getMessage());
	    }
	}
	

// Double Click on an Element
	
	public static void doubleClick(WebDriver driver, By locator) {
	    try {
	        WebElement element = driver.findElement(locator);
	        Actions actions = new Actions(driver);
	        actions.doubleClick(element).perform();
	        logger.info("Double-clicked on element: {}", locator);
	    } catch (Exception e) {
	        logger.error("Failed to double-click on element {}. Exception: {}", locator, e.getMessage());
	    }
	}
	

// Drag and Drop Action
	
	public static void dragAndDrop(WebDriver driver, By sourceLocator, By targetLocator) {
	    try {
	        WebElement source = driver.findElement(sourceLocator);
	        WebElement target = driver.findElement(targetLocator);
	        Actions actions = new Actions(driver);
	        actions.dragAndDrop(source, target).perform();
	        logger.info("Dragged element {} and dropped to {}", sourceLocator, targetLocator);
	    } catch (Exception e) {
	        logger.error("Failed to drag and drop from {} to {}. Exception: {}", sourceLocator, targetLocator, e.getMessage());
	    }
	}
	// Click and Hold (Drag Without Dropping)
	
	public static void clickAndHold(WebDriver driver, By locator) {
	    try {
	        WebElement element = driver.findElement(locator);
	        Actions actions = new Actions(driver);
	        actions.clickAndHold(element).perform();
	        logger.info("Clicked and held element: {}", locator);
	    } catch (Exception e) {
	        logger.error("Failed to click and hold element {}. Exception: {}", locator, e.getMessage());
	    }
	}
	// Release (Drop the Dragged Element)
	
	public static void releaseElement(WebDriver driver, By locator) {
	    try {
	        WebElement element = driver.findElement(locator);
	        Actions actions = new Actions(driver);
	        actions.release(element).perform();
	        logger.info("Released element: {}", locator);
	    } catch (Exception e) {
	        logger.error("Failed to release element {}. Exception: {}", locator, e.getMessage());
	    }
	}
	// Scroll to an Element Using JavaScript
	
	

	public static void scrollToElement(WebDriver driver, By locator) {
	    try {
	        WebElement element = driver.findElement(locator);
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	        logger.info("Scrolled to element: {}", locator);
	    } catch (Exception e) {
	        logger.error("Failed to scroll to element {}. Exception: {}", locator, e.getMessage());
	    }
	}

}