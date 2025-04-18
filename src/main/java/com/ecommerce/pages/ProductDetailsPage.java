package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ecommerce.utilities.Elements;

public class ProductDetailsPage {

	private WebDriver driver;

	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
	}

	private static By addToCartBtn = By.xpath("//span[@class='add_product']");
	private static By viewCartBtn = By.linkText("View Cart");
	
	private static By firstProductText = By.xpath("//h1[contains(text(),'Traditional Ethnic Long Sequins Embroidered Anarkali Gown')]");
	
	public String getFirstProductText() {
		System.out.println(Elements.getText(driver, firstProductText));
	return	Elements.getText(driver, firstProductText);
	}

	public String getProductDetailsPageTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
		
	}

	public CartPage addProductToCart() {
		Elements.doClick(driver, addToCartBtn);
		Elements.doClick(driver, viewCartBtn);
		return new CartPage(driver);
	}

}
