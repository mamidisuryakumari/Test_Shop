package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ecommerce.utilities.Elements;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	private By practiseSeleniumMenu = By.xpath("//a[text()='Practice Selenium']");
	private By bmiCalculatorLink = By.xpath("//a[text()='BMI Calculator']");
	private By practiseSeleniumMenu1=By.linkText("Practice Selenium");
	
	public String getHomePageTitle() {
		String homePageTitle=driver.getTitle();
		return homePageTitle;
	}
	
	public HomePage clickOnPractiseSeleniumMenu() {
		Elements.doClick(driver, practiseSeleniumMenu1);
		return this;
	}
	public BmiCalculatorPage clickOnBmiCalculatorLink() {
		Elements.doClick(driver, bmiCalculatorLink);
		return new BmiCalculatorPage(driver);
	}

}
