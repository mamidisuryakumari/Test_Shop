package com.ecommerce.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ecommerce.utilities.Elements;
import com.ecommerce.utilities.MouseActionsUtil;

public class ProductPage {

	private WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	private By menMenu = By.linkText("Men");
	private By menFootware = By.linkText("Men Footwear");
	private By mensComfortableShoe = By.xpath("//a[contains(text(),'Shock-Absorbent')]");
	private By addToCartBtn = By.xpath("//span[@class='add_product']");
	private static By viewCartBtn = By.linkText("View Cart");

	private By productTitles = By.xpath("//h2[@class='post-title item_name']");
	private By womenMenu = By.linkText("Women");
	private By womenKurties = By.linkText("Kurtis");
	private By firstProduct = By
			.xpath("//a[contains(text(), 'Georgette Traditional Ethnic Long Sequins Embroidered Anarkali Gown')]");
	private By secondproduct = By.xpath("//a[contains(text(),'Anarkali Kurti')]");

	private By product1 = By.xpath("(//i[@class='fa fa-shopping-bag'])[1]");
	private By product2 = By.xpath("(//i[@class='fa fa-shopping-bag'])[2]");

	public String getProductPageTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();

	}

	public ProductDetailsPage selectProduct() {

		MouseActionsUtil.moveToElement(driver, menMenu);
		MouseActionsUtil.moveToElement(driver, menFootware);
		Elements.doClick(driver, menFootware);
		Elements.doClick(driver, mensComfortableShoe);
		return new ProductDetailsPage(driver);
	}

	public ProductDetailsPage selectProductFromWomensCategeory() throws InterruptedException {

		MouseActionsUtil.moveToElement(driver, womenMenu);
		MouseActionsUtil.moveToElement(driver, womenKurties);
		Elements.doClick(driver, womenKurties);

		List<WebElement> allProducts = driver.findElements(productTitles);

		for (int i = 0; i < 2; i++) {

			WebElement product = allProducts.get(i);
			product.click();
			Elements.doClick(driver, addToCartBtn);
			Elements.doClick(driver, viewCartBtn);
			driver.navigate().back();
			driver.navigate().back();
	break;
		}

		return new ProductDetailsPage(driver);
	}

	public ProductDetailsPage selectFirstProduct() {
		MouseActionsUtil.moveToElement(driver, womenMenu);
		MouseActionsUtil.moveToElement(driver, womenKurties);
		Elements.doClick(driver, womenKurties);
		Elements.doClick(driver, firstProduct);
		return new ProductDetailsPage(driver);
	}

	public ProductDetailsPage selectSecondProduct() {

		Elements.doClick(driver, secondproduct);
		return new ProductDetailsPage(driver);
	}

	public void addMultipleProducts() {
		Elements.doClick(driver, product1);
		Elements.doClick(driver, product2);
	}

}
