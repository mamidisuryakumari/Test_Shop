package com.ecommerce.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ecommerce.hooks.Hooks;
import com.ecommerce.pages.ProductPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductPageSteps {

	WebDriver driver = Hooks.getDriver();
	private static Logger log = LoggerFactory.getLogger(ProductPageSteps.class);
	ProductPage productPage = new ProductPage(driver);

	@Given("I am on the product page")
	public void i_am_on_the_product_page() {
		String expectedTitle = "ynrstore";

		try {
			String actualTitle = productPage.getProductPageTitle();
			Assert.assertEquals(expectedTitle, actualTitle);
			log.info("Product page title matched: ");
		} catch (AssertionError ae) {
			log.error("Assertion failed while verifying product page title", ae);
			throw ae;
		} catch (Exception e) {
			log.error("An exception error occurred while verifying product page title", e);
			throw e;
		}
	}

	@When("I select a product from the Men's category")
	public void i_select_a_product_from_the_men_s_category() {
		try {
			productPage.selectProduct();
			log.info("The product is selected from men's category");
		} catch (Exception e) {
			log.error("An exception error occured while selecting the produect", e);
			throw e;
		}

	}

	
	
	
	@When("I select first product from the Women's category")
	public void i_select_first_product_from_the_women_s_category() {
		try {
			productPage.selectFirstProduct();
			log.info("The first product is selected");
		} catch (Exception e) {
			log.error("An exception error occured while selecting the first product", e);
			throw e;
		}
	}
	@When("I navigate back to product page")
	public void i_navigate_back_to_product_page() {
	  driver.navigate().back();
	}
	@Then("I should be navigated to product page")
	public void i_should_be_navigated_to_product_page() {
	  try {
		
	} catch (Exception e) {
		
	}
	}
	@When("I select second product from the Women's category")
	public void i_select_second_product_from_the_women_s_category() {
	 productPage.selectSecondProduct();
	}
	
	

	@When("I add multiple products to cart")
	public void i_add_multiple_products_to_cart() {
	   productPage.addMultipleProducts();
	}
	

	@When("I select {string} from the Women's category")
	public void i_select_from_the_women_s_category(String string) {
	    productPage.selectFirstProduct();
	}
	
	

	@When("I select product from the Women's category")
	public void i_select_product_from_the_women_s_category() throws InterruptedException {
	  productPage.selectProductFromWomensCategeory();
	}
	@When("I add multiple products to the product to cart")
	public void i_add_multiple_products_to_the_product_to_cart() {
	   
	}
	@Then("I should see the multiple products added to the cart successfully")
	public void i_should_see_the_multiple_products_added_to_the_cart_successfully() {
	    
	}










}
