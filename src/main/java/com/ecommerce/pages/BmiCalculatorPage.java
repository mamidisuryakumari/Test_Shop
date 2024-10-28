package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ecommerce.utilities.Elements;

public class BmiCalculatorPage extends BasePage {

	public BmiCalculatorPage(WebDriver driver) {
		super(driver);
	}

	private By feetField = By.id("heightFeet");
	private By inchesField = By.id("heightInches");
	private By weightField = By.id("weight");
	private By femaleBtn = By.id("female");
	private By ageField = By.id("age");
	private By calculateBMIBtn = By.id("calculateBtn");
	private By resetBtn = By.id("resetBtn");

	public String getBmiPageTitle() {
		String bmiPageTitle = driver.getTitle();
		System.out.println(driver.getTitle());
		return bmiPageTitle;
	}

	public BmiCalculatorPage enterFeet(String feet) {
		Elements.doSendKeys(driver, feetField, feet);
		return this;
	}

	public BmiCalculatorPage enterInches(String inches) {
		Elements.doSendKeys(driver, inchesField, inches);
		return this;
	}

	public BmiCalculatorPage enterWeight(String weight) {
		Elements.doSendKeys(driver, weightField, weight);
		return this;
	}

	public BmiCalculatorPage enterAge(String age) {
		Elements.doSendKeys(driver, ageField, age);
		return this;
	}
	public BmiCalculatorPage clickOnFemaleBtn() {
		Elements.doClick(driver, femaleBtn);
		return this;
	}
	public BmiCalculatorPage clickOnCalculateBmiBtn() {
		Elements.doClick(driver, calculateBMIBtn);
		return this;
	}
}
