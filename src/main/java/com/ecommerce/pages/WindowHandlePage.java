package com.ecommerce.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ecommerce.utilities.Elements;
import com.ecommerce.utilities.Window;

public class WindowHandlePage extends BasePage {

	public WindowHandlePage(WebDriver driver) {
		super(driver);
	}

	private By singleWindowButton = By.id("single-window-button");
	private By twoWindowBtn = By.id("multiple-window-button");

	public WindowHandlePage clickOnTwoWindowBtn() {
		Elements.doClick(driver, twoWindowBtn);
		return this;
	}

	public WindowHandlePage clickOnSingleWindowButton() {
		Elements.doClick(driver, singleWindowButton);
		return this;
	}

	public String getActualWindowPageTitle() {
		String actualTitle = driver.getTitle();
		return actualTitle;
	}

	public WindowHandlePage switchToChildWindow() {
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		clickOnSingleWindowButton();
		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {

			if (handle != parentWindow) {
				String childWindow = handle;
				System.out.println(childWindow);
				driver.switchTo().window(childWindow);
			}
		}
		return this;
	}
	
	public WindowHandlePage switchToChildWindow1() {
	//	Window.switchToWindow(driver, singleWindowButton);
		return this;
	}
	public WindowHandlePage switchToGoogleWindow() {
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		clickOnTwoWindowBtn();
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
	     if (handle != parentWindow) {
				String childWindow = handle;
				System.out.println(childWindow);
				driver.switchTo().window(childWindow);
			}
		}
		return this;
	}

	
	
}
