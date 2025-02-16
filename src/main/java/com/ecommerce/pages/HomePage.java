package com.ecommerce.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ecommerce.utilities.Elements;
import com.ecommerce.utilities.Window;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	private By practiseSeleniumMenu = By.xpath("//a[text()='Practice Selenium']");
	private By bmiCalculatorLink = By.xpath("//a[text()='BMI Calculator']");
	private By practiseSeleniumMenu1=By.linkText("Practice Selenium");
    private By windowHandleLink=By.xpath("//a[text()='Handle Multiple windows']");
    private By testShopLink=By.xpath("//a[text()='Test Shop']");
    
    public ProductPage clickOnTestShopLink() {
    	Elements.doClick(driver, testShopLink);
		return new ProductPage(driver);
    }
	
	public WindowHandlePage clickOnWindowHandleLink() {
		
		Elements.doClick(driver, windowHandleLink);
		return new WindowHandlePage(driver);
	}
	
	
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
