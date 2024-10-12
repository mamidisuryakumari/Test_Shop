package com.ecommerce.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ecommerce.utilities.Elements;

public class CartPage extends BasePage {

	public CartPage(WebDriver driver) {
		super(driver);

	}

	private By itemText = By.xpath("//div[@id='cartItem_SCI-1']/div[2]");
	private By removeBtn = By.xpath("//i[@class='fa fa-minus']");
	private By itemCountText = By.xpath("//div[@class='sora-cart-details']/span[@class='simpleCart_quantity']");
	private By addBtn = By.xpath("//a[@class='simpleCart_increment']");
	private By checkoutBtn = By.xpath("//a[text()='Proceed to Checkout']");
	private By cartItemsCount = By.xpath("//div[@class='simpleCart_items']");
	public int actualProductCount;
	private By itemQuantity = By.xpath("(//div[@class='item-quantity'])[2]");
	private By cartPageTextFld = By.xpath("//h2[contains(text(),'You have')]");

	public String getActualCartPageText() {
		String cartPageText = Elements.getText(driver, cartPageTextFld);
		return cartPageText;
	}

	public int getItemsInCart() {
		int itemCount = Integer.parseInt(Elements.getText(driver, itemQuantity));
		return itemCount;
	}

	public int cartItemsCount() {
		List<WebElement> cartItems = driver.findElements(cartItemsCount);
		actualProductCount = cartItems.size();
		System.out.println(actualProductCount);
		return actualProductCount;
	}

	public CartPage clickOnaddBtn() {
		Elements.doClick(driver, addBtn);
		return this;
	}

	public String getCartPageTitle() {
		String cartPageTitle = driver.getTitle();
		return cartPageTitle;

	}

	public String expCartPagetext() {
		String cartPageExpText = "You have 2 item(s) in your Cart.";
		return cartPageExpText;

	}

	public String itemLinkTextInCart() {
		String itemTextInCart = Elements.getText(driver, itemText);
		return itemTextInCart;
	}

	public CartPage clickOnremoveBtn() {
		Elements.doClick(driver, removeBtn);
		return this;
	}

	public int getitemcount() {
		int itemCount = Integer.valueOf(Elements.getText(driver, itemCountText));
		return itemCount;

	}

	public CheckoutPage clickOnCheckoutBtn() {
		Elements.doClick(driver, checkoutBtn);
		return new CheckoutPage(driver);
	}

}
