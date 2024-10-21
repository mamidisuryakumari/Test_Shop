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
	private By productQuantity=By.xpath("//span[@class='simpleCart_quantity']");
	
	public int getProductsInShoppingBag() {
		int products= Integer.parseInt(Elements.getText(driver, productQuantity));
				return products;
	}

	public String getProductDetailsPageTitle() {
		String productDetailsPageActualTitle = driver.getTitle();
		System.out.println(productDetailsPageActualTitle);
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
