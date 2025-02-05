package com.ecommerce.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.ecommerce.base.BaseTest;
import com.ecommerce.hooks.Hooks;
import com.ecommerce.pages.ConfirmationPage;
import com.ecommerce.pages.ProductPage;
import com.ecommerce.reports.ReportManager;
import com.ecommerce.utilities.Constants;

import io.cucumber.java.en.Then;

public class ConfirmationPageSteps {
	
	WebDriver driver = Hooks.getDriver();
	
	ConfirmationPage confirmationPage = new ConfirmationPage(driver);
	ProductPage page = new ProductPage(driver);

	
	@Then("User navigated to order details page")
	public void user_navigated_to_order_details_page() {
		 confirmationPage = new ConfirmationPage(driver);
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
	@Then("The user should see the total price after purchase includes the product price and delivery charge")
	public void the_user_should_see_the_total_price_after_purchase_includes_the_product_price_and_delivery_charge() {
	  
	    page = new ProductPage(driver);
      
      System.out.println(page.productPrice());
	  
	   int productExpectedPrice = 50;
		int actualPrice=page.productPrice();
	   
	   Assert.assertEquals(productExpectedPrice, actualPrice + Constants.devliverCharge);  
	}
	@Then("The user should see the product price increase after purchase")
	public void the_user_should_see_the_product_price_increase_after_purchase() {
	   
	}
	@Then("The price after purchase should be {string}")
	public void the_price_after_purchase_should_be(String string) {
	    
	}
	
}
