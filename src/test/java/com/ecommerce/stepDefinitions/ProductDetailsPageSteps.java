package com.ecommerce.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import com.ecommerce.hooks.Hooks;
import com.ecommerce.pages.ProductDetailsPage;
import com.ecommerce.reports.ReportManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductDetailsPageSteps {
	
	WebDriver driver = Hooks.getDriver();
	
	ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
	
	@Then("User navigated to the product details page")
	public void user_navigated_to_the_product_details_page() throws Exception {
		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
		String exceptedProductdetailsPageTitle = "Men's Comfortable, Shock-Absorbent & Slip-Resistant Formal Shoes";
		try {
			Assert.assertEquals(productDetailsPage.getProductDetailsPageTitle(), exceptedProductdetailsPageTitle);
			System.out.println("Landed on product details page");
			ReportManager.getTest().pass("User navigated to the product details page successfully");
		//	ScreenShot.takeScreenShot(driver,"ProductdetailsPage");
		} catch (AssertionError ae) {
			System.err.println("Assertion failed" + ae.getMessage());
			ReportManager.getTest().fail("Failed to land on product details page");
			throw ae;
		} catch (Exception e) {
			System.err.println("An error occured navigating to the product details page " + e.getMessage());
			ReportManager.getTest().fail("An error occured while navigating to the product details page");
			throw e;
		}
	}
	@When("User click on add to cart button")
	public void user_click_on_add_to_cart_button() {
		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
		productDetailsPage.ClickOnAddProductBtn();
		ReportManager.getTest().info("Clicked on add to cart button");
	}

	@Then("User should see item add to cart")
	public void i_should_see_item_add_to_cart() {
		ProductDetailsPage procuDetailsPage = new ProductDetailsPage(driver);
		int ExceptedProductsInShoppingBag = 1;
		try {
			Assert.assertEquals(ExceptedProductsInShoppingBag, procuDetailsPage.getProductsInShoppingBag());
			System.out.println("item added to cart successfully");
			ReportManager.getTest().pass("item added to cart successfully");
		} catch (AssertionError ae) {
			System.err.println("Assertion failed" + ae.getMessage());
			ReportManager.getTest().fail("Failed to item added to cat");
			throw ae;
		} catch (Exception e) {
			System.err.println("An error occured navigating to the item added to the cart" + e.getMessage());
			ReportManager.getTest().fail("An error occured navigating to the item added to the cart");
			throw e;
		}
	}

	@When("User click on view cart button")
	public void user_click_on_view_cart_button() {
		
		productDetailsPage.ClickOnViewCartBtn();
		ReportManager.getTest().info("Clicked on view cart button");
	}
	@Then("User again navigated to the product details page")
		public void user_again_navigated_to_the_product_details_page() {
		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
		String exceptedProductdetailsPageTitle = "Stylish and Trendy Belts for Men";
		try {
			Assert.assertEquals(productDetailsPage.getProductDetailsPageTitle(), exceptedProductdetailsPageTitle);
			System.out.println("Landed on product details page");
			ReportManager.getTest().pass("User navigated to the product details page successfully");
		} catch (AssertionError ae) {
			System.err.println("Assertion failed" + ae.getMessage());
			ReportManager.getTest().fail("Failed to land on product details page");
			throw ae;
		} catch (Exception e) {
			System.err.println("An error occured navigating to the product details page " + e.getMessage());
			ReportManager.getTest().fail("An error occured while navigating to the product details page");
			throw e;
		}
	}
	@When("User click on navigate back button")
	public void user_click_on_navigate_back_button() {
    driver.navigate().back();
	}
}
