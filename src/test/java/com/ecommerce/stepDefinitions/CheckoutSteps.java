package com.ecommerce.stepDefinitions;

import com.ecommerce.base.BaseTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps extends BaseTest {
	@Then("User should navigated to the checkout page")
	public void user_should_navigated_to_the_checkout_page() {
	    
	}

	@When("User enter address details {string},{string}, {string},{string},{string},{string}, {string},{string}, {string}")
	public void user_enter_address_details(String yourName, String phoneNumber, String streetName, String emailAddress,
			String postcode, String city, String state, String country, String orderNotes) {
	   
	}

	@When("User click on Upi tranfer button")
	public void user_click_on_upi_tranfer_button() {
	   
	}

	@When("User click on confirm order button")
	public void user_click_on_confirm_order_button() {
	  
	}

	@Then("User should see place ored button enabled")
	public void user_should_see_place_ored_button_enabled() {
	   
	}

	@When("User click on place order button")
	public void user_click_on_place_order_button() {
	   
	}

	


}
