package com.ecommerce.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsUtil {
	private static boolean bstatus;
	static WebDriver driver;

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
}