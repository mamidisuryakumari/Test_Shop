package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ecommerce.utilities.Elements;

public class ProductDetailsPage extends BasePage {

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
		
	}

	private By addProductBtn = By.xpath("//span[@class='add_product']");
	private By viewCartBtn = By.xpath("//a[@class='sora-cart-view']");
	
	private By add =By.xpath("//span[@class='add_product']");

	public String getProductDetailsPageTitle() {
		String productDetailsPageActualTitle = driver.getTitle();
				return productDetailsPageActualTitle;
	}

	public ProductDetailsPage ClickOnAddProductBtn() {
		Elements.doClick(driver, addProductBtn);
		
		return this;
	}

	public CartPage ClickOnViewCartBtn() {
		Elements.doClick(driver, viewCartBtn);
		return new CartPage(driver);
	}
	
	

}
