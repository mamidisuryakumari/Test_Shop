package com.ecommerce.stepDefinitions;

import java.io.FileNotFoundException;

import org.junit.Assert;

import com.ecommerce.base.BaseTest;
import com.ecommerce.pages.CartPage;
import com.ecommerce.pages.CheckoutPage;
import com.ecommerce.pages.ConfirmationPage;
import com.ecommerce.pages.ProductDetailsPage;
import com.ecommerce.pages.ProductPage;
import com.ecommerce.reports.ReportManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrderSteps extends BaseTest{
	@Given("I am on the product page")
	public void i_am_on_the_product_page() {
		ReportManager.getTest().info("I am on product page");
	}

	@When("I  click on the productlink")
	public void i_click_on_the_productlink() {
		ProductPage productPage = new ProductPage(driver);
		productPage.clickOncoriaMateSetProduct();
		ReportManager.getTest().info("Clicked on product link");
	}

	@Then("I navigated to the Product details page")
	public void i_navigated_to_the_product_details_page() {
		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
		String exceptedTitle = "Elegant Korai Floor Mats Set";
		try {
			Assert.assertEquals(productDetailsPage.getProductDetailsPageTitle(), exceptedTitle);
			System.out.println("Landed on product details page");
			ReportManager.getTest().pass("Navigated to the product details page successfully");
		} catch (AssertionError ae) {
			System.out.println("Assertion failed" + ae.getMessage());
			ReportManager.getTest().fail("An error occured navigating to the product details page");
			throw ae;
		} catch (Exception e) {
			System.out.println("An error occured navigating to the product details page");
			ReportManager.getTest().fail("An error occured navigating to the product details page");
			throw e;
		}

	}

	@When("I click on the add to cart button")
	public void i_click_on_the_add_to_cart_button() {
		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
		productDetailsPage.ClickOnAddProductBtn();
		ReportManager.getTest().info("Clicked on addd to cart button");
	}

	@Then("Item added to the cart")
	public void item_added_to_the_cart() {
		ReportManager.getTest().info("Item added to the cart");
	}

	@When("I click on the view cart button")
	public void i_click_on_the_view_cart_button() {
		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
		productDetailsPage.ClickOnViewCartBtn();
		ReportManager.getTest().info("Clicked on the view cart button");
	}

	@Then("I navigated to the cart page")
	public void i_navigated_to_the_cart_page() {
		CartPage cartPage = new CartPage(driver);
		String ExpectedCartPageTitle = "My Cart";
		try {
			Assert.assertEquals(cartPage.getCartPageTitle(), ExpectedCartPageTitle);
			System.out.println("Landed on cart page");
			ReportManager.getTest().pass("Navigated to the cart page successfully");
		} catch (AssertionError ae) {
			System.out.println("Assertion failed" + ae.getMessage());
			ReportManager.getTest().fail("An error occured while navigating to the cart page");
			throw ae;
		} catch (Exception e) {
			System.out.println("An error occured while navigating to the cart page");
			ReportManager.getTest().fail("An error occured while navigating to the cart page");
			throw e;
		}

	}

	@Then("I should see item in the cart")
	public void i_should_see_item_in_the_cart() {
		ReportManager.getTest().info("I should see item in the cart");
	}

	@When("I click on the proceed to checkout button")
	public void i_click_on_the_proceed_to_checkout_button() {
		CartPage cartPage = new CartPage(driver);
		cartPage.clickOnCheckoutBtn();
		ReportManager.getTest().info("Clicked on checkout button");
	}

	@When("I navigated to checkout page")

	public void i_navigated_to_checkout_page() throws FileNotFoundException {
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

	@When("I enter address details {string},{string}, {string},{string},{string},{string}, {string},{string}, {string}")
	public void i_enter_address_details(String yourName, String phoneNumber, String streetName, String emailAddress,
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

	@When("I click on Upi tranfer button")
	public void i_click_on_upi_tranfer_button() {
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.clickOnUpiTransferBtn();
		ReportManager.getTest().info("Clicked on upi transfer button");

	}

	@When("I click on confirm order button")
	public void i_click_on_confirm_order_button() {
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.clickOnConfirmOrderBtn();
		ReportManager.getTest().info("Clicked on confirm order button");
	}

	@Then("I should see place ored button enabled")
	public void i_should_see_place_ored_button_enabled() {
		ReportManager.getTest().info("Place oredr button enabled successfully");
	}

	@When("I click on place order button")
	public void i_click_on_place_order_button() throws InterruptedException {
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.clickOnPlaceOrderBtn();
		ReportManager.getTest().info("Clicked on place oredr button");
		Thread.sleep(5000);
	}

	@Then("I navigated to order details page")
	public void i_navigated_to_order_details_page() {
		
		ConfirmationPage confirmationPage = new ConfirmationPage(driver);
		String expMsg="THANK SURYA. WE RECEIVED YOUR ODER.";
		try {
			Assert.assertEquals(confirmationPage.getSucessmsg(),expMsg);
            ReportManager.getTest().pass("Landed on order details page");
		} catch (AssertionError ae) {
			System.out.println(ae.getMessage());
			ReportManager.getTest().fail("An error occured while navigating the oredr details page");
			throw ae;
		} catch (Exception e) {
			System.out.println("An error occured while navigating the oredr details page");
			ReportManager.getTest().fail("An error occured while navigating the oredr details page");
			throw e;
		}

		

	}

}