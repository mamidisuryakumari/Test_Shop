package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ecommerce.utilities.Constants;
import com.ecommerce.utilities.Elements;

public class CheckoutPage extends BasePage {

	public CheckoutPage(WebDriver driver) {
		super(driver);

	}

	private By nameFld = By
			.xpath("//div[@class='form contact-form soracustomform']//input[@id='ContactForm1_contact-form-name']");
	private By emailAddressFld = By
			.xpath("//div[@class='form contact-form soracustomform']//input[@id='ContactForm1_contact-form-email']");
	private By phoneNumberFld = By.xpath("//input[@name='phone number']");
	private By postCodeFld = By.xpath("//input[@name='postcode']");
	private By streetNameFld = By.xpath("//input[@placeholder='Apartment, Street Name, etc *']");
	private By cityFld = By.xpath("//input[@placeholder='City *']");
	private By stateFld = By.xpath("//input[@placeholder='State *']");
	private By countryFld = By.xpath("//input[@placeholder='Country *']");
	private By orderNotesFld = By.xpath("//textarea[@name='order notes']");
	private By upiTransferBtn = By.xpath("//input[@id='sora-upi']");
	private By confirmOrderBtn = By.xpath("//input[@value='Confirm Order']");
	private By placeOrderBtn = By.xpath("//input[@value='Place Order'] ");
	private By grandTotal = By.xpath("//span[@class='simpleCart_grandTotal']");
	
	public float getGrandTotal() {
	    String totalCostString = Elements.getText(driver, grandTotal);
	    totalCostString = totalCostString.replace("$", ""); // Remove the dollar sign
	    float totalCost = Float.parseFloat(totalCostString); // Parse the remaining value as a float
	    return totalCost;
	}

/*	public float getGrandTotal() {

	float totalCost=Float.parseFloat(Elements.getText(driver, grandTotal));
		return totalCost;
	}*/

	public String checkOutPageTitle() {
		WebDriverWait wait = new WebDriverWait(driver, Constants.maxWaitTime); // 10 seconds timeout
		wait.until(ExpectedConditions.titleIs("Checkout"));
		return driver.getTitle();
	}

	public CheckoutPage enterName(String name) {
		Elements.doSendKeys(driver, nameFld, name);
		return this;
	}

	public CheckoutPage enterEmailAddress(String email) {
		Elements.doSendKeys(driver, emailAddressFld, email);
		return this;
	}

	public CheckoutPage enterPhoneNumber(String phoneNumber) {
		Elements.doSendKeys(driver, phoneNumberFld, phoneNumber);
		return this;
	}

	public CheckoutPage enterPostcode(String postcode) {
		Elements.doSendKeys(driver, postCodeFld, postcode);
		return this;
	}

	public CheckoutPage enterStreeName(String streetName) {
		Elements.doSendKeys(driver, streetNameFld, streetName);
		return this;
	}

	public CheckoutPage enterCity(String city) {
		Elements.doSendKeys(driver, cityFld, city);
		return this;
	}

	public CheckoutPage enterState(String state) {
		Elements.doSendKeys(driver, stateFld, state);
		return this;
	}

	public CheckoutPage enterCountry(String country) {
		Elements.doSendKeys(driver, countryFld, country);
		return this;
	}

	public CheckoutPage enterOrderNotes(String ordernotes) {
		Elements.doSendKeys(driver, orderNotesFld, ordernotes);
		return this;
	}

	public CheckoutPage clickOnConfirmOrderBtn() {
		Elements.doClick(driver, confirmOrderBtn);
		return this;
	}

	public ConfirmationPage clickOnPlaceOrderBtn() {
		Elements.doClick(driver, placeOrderBtn);
		return new ConfirmationPage(driver);
	}

	public CheckoutPage clickOnUpiTransferBtn() {
		Elements.doClick(driver, upiTransferBtn);
		return this;
	}
}
