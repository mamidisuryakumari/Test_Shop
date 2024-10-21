package com.ecommerce.stepDefinitions;

import org.junit.Assert;

import com.ecommerce.base.BaseTest;
import com.ecommerce.pages.CheckoutPage;
import com.ecommerce.pages.ConfirmationPage;
import com.ecommerce.reports.ReportManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps extends BaseTest {
	@Then("User should navigated to the checkout page")
	public void user_should_navigated_to_the_checkout_page() {
		String expectedCheckoutPageTitle = "Checkout";
		CheckoutPage checkoutPage = new CheckoutPage(driver);

		try {
			Assert.assertEquals(checkoutPage.checkOutPageTitle(), expectedCheckoutPageTitle);
			System.out.println("Landed on Checkout page");
			ReportManager.getTest().pass("Navigated to checkout page successfully");
		} catch (AssertionError ae) {
			System.out.println(ae.getMessage());
			ReportManager.getTest().fail("An error occured while navigating to the check out page");
			throw ae;
		} catch (Exception e) {
			ReportManager.getTest().fail("An error occured while navigating to the check out page");
			throw e;
		}
	}

	@When("User enter address details {string},{string}, {string},{string},{string},{string}, {string},{string}, {string}")
	public void user_enter_address_details(String yourName, String phoneNumber, String streetName, String emailAddress,
			String postcode, String city, String state, String country, String orderNotes) {
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.enterName(yourName);
		checkoutPage.enterPhoneNumber(phoneNumber);
		checkoutPage.enterStreeName(streetName);
		checkoutPage.enterEmailAddress(emailAddress);
		checkoutPage.enterPostcode(postcode);
		checkoutPage.enterCity(city);
		checkoutPage.enterState(state);
		checkoutPage.enterCountry(country);
		checkoutPage.enterOrderNotes(orderNotes);
		ReportManager.getTest().info("Entered address details successfully");
	}

	@When("User click on Upi tranfer button")
	public void user_click_on_upi_tranfer_button() {
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.clickOnUpiTransferBtn();
		ReportManager.getTest().info("Clicked on upi transfer button");
	}

	@When("User click on confirm order button")
	public void user_click_on_confirm_order_button() {
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.clickOnConfirmOrderBtn();
		ReportManager.getTest().info("Clicked on confirm order button");
	}

	@Then("User should see place ored button enabled")
	public void user_should_see_place_ored_button_enabled() {
		ReportManager.getTest().info("Place oredr button enabled successfully");
	}

	@When("User click on place order button")
	public void user_click_on_place_order_button() throws InterruptedException {
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.clickOnPlaceOrderBtn();
		ReportManager.getTest().info("Clicked on place oredr button");
		Thread.sleep(5000);
	}

	
}
