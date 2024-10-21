package com.ecommerce.stepDefinitions;

import org.junit.Assert;

import com.ecommerce.base.BaseTest;
import com.ecommerce.pages.ProductPage;
import com.ecommerce.reports.ReportManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductPageSteps extends BaseTest {

	@Given("The user on the product page")
	public void the_user_on_the_product_page() throws InterruptedException {

		ProductPage productPage = new ProductPage(driver);
		String expectedProductPageTitle = "ynrstore";

		try {
			Assert.assertEquals(productPage.actualProductPageTitle(), expectedProductPageTitle);
			System.out.println("Landed on product page");
			ReportManager.getTest().pass("User successfully navigated to the product page");
		} catch (AssertionError ae) {
			System.out.println("Assertion failed: " + ae.getMessage());
			ReportManager.getTest().fail("Failed to land on product page");
			throw ae;
		} catch (Exception e) {
			System.out.println("An error occured navigating to the product page " + e.getMessage());
			ReportManager.getTest().fail("An error occured while navigating to the product page");
			throw e;
		}
	}

	@When("The page loads")
	public void the_page_loads() {
		ProductPage productPage = new ProductPage(driver);
		try {
			Assert.assertTrue(productPage.isPageLoaded());
			System.out.println("Product page loaded successfully");
			ReportManager.getTest().pass("Page loaded successfully");
		} catch (AssertionError ae) {
			System.out.println("Assertion failed: " + ae.getMessage());
			ReportManager.getTest().fail("Product page failed to load: " + ae.getMessage());
			throw ae;
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
			ReportManager.getTest().fail("An unexpected error occurred while loading the product page");
			throw e;
		}

	}
	
	@When("select the category from menu")
	public void selectitemFromMenu()
	{
		ProductPage page = new ProductPage(driver);
		page.moveToMenMenu();
		page.moveToSubMenu();
		ReportManager.getTest().info("Category is selected");
	}

	@Then("The user should see list of products")
	public void the_user_should_see_list_of_products() {
		ProductPage page = new ProductPage(driver);
						ReportManager.getTest().info("Product list is displayed");
	}

	@Then("Each product should display the name,price and image")
	public void each_product_should_display_the_name_price_and_image() throws InterruptedException {
		ProductPage productPage = new ProductPage(driver);
		ReportManager.getTest().info("Each product should display the name,price and image");
		Thread.sleep(5000);
	}

	@When("click on shoppingbag symbol")
	public void click_on_shoppingbag_symbol() throws InterruptedException {
		ProductPage productPage = new ProductPage(driver);
		Thread.sleep(3000);
		productPage.clickOnproductPageShoppingBagSymbol();
		ReportManager.getTest().info("Click on shopping bag symbol");
	}

	@Then("User should see item added to the cart")
	public void user_should_see_item_added_to_the_cart() {
		ProductPage productPage = new ProductPage(driver);
		int expectedItemCount = 1;
		try {
			Assert.assertEquals(expectedItemCount, productPage.getItemCount());
			System.out.println("Item added to the cart successfully.");
			ReportManager.getTest().pass("Item successfully added to the cart.");
		} catch (AssertionError ae) {

			System.out.println("Assertion failed: " + ae.getMessage());
			ReportManager.getTest().fail("Failed to add item to the cart.");
			throw ae;
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
			ReportManager.getTest().fail("An error occurred while adding item to the cart.");
			throw e;
		}
		
	}
	@When("User click on checkout button")
	public void user_click_on_checkout_button() {
		ProductPage productPage = new ProductPage(driver);
		productPage.clickOnshoppingBagSymbol1();
		ReportManager.getTest().info("User clicked on checkout button successfully");
	}
	@When("User click on product link")
	public void user_click_on_product_link() {
		ProductPage productPage = new ProductPage(driver);
		productPage.clickOnStylishStonyStarkLink();
		ReportManager.getTest().info("Clicked on product link");
	}


}
