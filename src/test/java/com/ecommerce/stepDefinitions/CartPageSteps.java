package com.ecommerce.stepDefinitions;

import org.junit.Assert;

import com.ecommerce.base.BaseTest;
import com.ecommerce.pages.CartPage;
import com.ecommerce.pages.ProductDetailsPage;
import com.ecommerce.pages.ProductPage;
import com.ecommerce.reports.ReportManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartPageSteps extends BaseTest {
	
	

	

	@Then("User navigated to the cart page")
	public void user_navigated_to_the_cart_page() {
		CartPage cartPage = new CartPage(driver);
		String ExpectedCartPageTitle = "My Cart";
		try {
			Assert.assertEquals(cartPage.getCartPageTitle(), ExpectedCartPageTitle);
			System.out.println("Landed on cart page");
			ReportManager.getTest().pass("Navigated to the cart page successfully");
		} catch (AssertionError ae) {
			System.err.println("Assertion failed" + ae.getMessage());
			ReportManager.getTest().fail("An error occured while navigating to the cart page");
			throw ae;
		} catch (Exception e) {
			System.err.println("An error occured while navigating to the cart page");
			ReportManager.getTest().fail("An error occured while navigating to the cart page");
			throw e;
		}
	}

	@Then("User should see item in cart")
	public void user_should_see_item_in_to_cart() {
		CartPage cartPage = new CartPage(driver);
		String cartPageExpText = "You have 1 item(s) in your Cart.";
		try {
			Assert.assertEquals(cartPage.getActualCartPageText(), cartPageExpText);
			System.out.println("Items are correctly displayed in the cart");
			ReportManager.getTest().pass("User can see items in cart");
		} catch (AssertionError ae) {
			System.err.println("Assertion failed" + ae.getMessage());
			ReportManager.getTest().fail("User cannot see items in cart");
			throw ae;
		} catch (Exception e) {
			System.err.println("An error occurred while checking the cart" + e.getMessage());
			ReportManager.getTest().fail("User cannot see items in cart");
			throw e;
		}
	}

	@When("User click on remove button")
	public void user_click_on_remove_button() {
		CartPage cartPage = new CartPage(driver);
		cartPage.clickOnremoveBtn();
		ReportManager.getTest().info("User clicked on remove button");
	}

	@Then("User should see item remove from the cart")
	public void user_should_see_item_remove_from_the_cart() {
		CartPage cartPage = new CartPage(driver);
		String cartPageExpText = "You have 0 item(s) in your Cart.";
		try {
			Assert.assertEquals(cartPage.getActualCartPageText(), cartPageExpText);
			System.out.println("Item was correctly removed from the cart");
			ReportManager.getTest().pass("User can see the item removed from the cart");
		} catch (AssertionError ae) {
			System.err.println("Assertion failed: " + ae.getMessage());
			ReportManager.getTest().fail("User cannot see the item removed from the cart");
			throw ae;
		} catch (Exception e) {
			System.err.println("An error occurred while checking the cart" + e.getMessage());
			ReportManager.getTest().fail("User cannot see the item removed from the cart");
			throw e;
		}
	}

	@When("User click on add button")
	public void user_click_on_add_button() {
		CartPage cartPage = new CartPage(driver);
		cartPage.clickOnaddBtn();
		ReportManager.getTest().info("Clicked on add button");
	}

	@Then("User should see item count increased in cart")
	public void user_should_see_item_count_increased_in_cart() {
		CartPage cartPage = new CartPage(driver);
		int expItemcount = 2;
		try {
			Assert.assertEquals(cartPage.getItemsInCart(), expItemcount);
			System.out.println("Item count increased in cart");
			ReportManager.getTest().pass("User can see item count increased in cart");
		} catch (AssertionError ae) {
			System.err.println("Assertion failed: " + ae.getMessage());
			ReportManager.getTest().fail("User cannot see item count increased in cart");
			throw ae;
		} catch (Exception e) {
			System.err.println("An error occurred while checking the cart" + e.getMessage());
			ReportManager.getTest().fail("User cannot see item count increased in cart");
			throw e;
		}
	}

	@Then("User should see item count decreased in the cart")
	public void user_should_see_item_count_decreased_in_the_cart() {
		CartPage cartPage = new CartPage(driver);
		int expItemcount = 1;
		try {
			Assert.assertEquals(cartPage.getItemsInCart(), expItemcount);
			System.out.println("Item count decreased in cart");
			ReportManager.getTest().pass("User can see item count decreased in cart");
		} catch (AssertionError ae) {
			System.err.println("Assertion failed: " + ae.getMessage());
			ReportManager.getTest().fail("User cannot see item count decreased in cart");
			throw ae;
		} catch (Exception e) {
			System.err.println("An error occurred while checking the cart" + e.getMessage());
			ReportManager.getTest().fail("User cannot see item count decreased in cart");
			throw e;
		}

	}
	@When("User click on product1")
	public void user_click_on_product1() {
	    
	}

	@Then("User should see product1 added to cart")
	public void user_should_see_product1_added_to_cart() {
	    
	}

	@When("User click on navigate back button")
	public void user_click_on_navigate_back_button() {
	   
	}

	@Then("User should be navigated to product page")
	public void user_should_be_navigated_to_product_page() {
	   
	}

	@When("User click on product2")
	public void user_click_on_product2() {
	   
	}

	@Then("User should see two items added to cart")
	public void user_should_see_two_items_added_to_cart() {
	    
	}
	
	
	
	
	
	
	
	
	
}
