package com.ecommerce.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ecommerce.utilities.Elements;
import com.ecommerce.utilities.MouseActionsUtil;

public class ProductPage extends BasePage{

	public ProductPage(WebDriver driver) {
		super(driver);
			}

	private int actualProductPrice;
	

   

	String actualPricewithDollar;
	private By menuItem = By.linkText("Men");
	private By subMenuItem = By.linkText("Men Footwear");
	private By fancyCoolProduct = By.xpath("//a[text()='Fancy Cool Product']");
	private By estanDentaCleanProduct = By
			.xpath("//a[contains(text(),'ESTAN Denta Clean Herbal Tooth Paste with Mouth Wash')]");
	private By orayaProduct = By.xpath("//a[contains(text(),'ORAYA 100% Natural Activated Charcoal Teeth Whiten')]");
	private By addItemList = By.xpath("//a[@class='item_add']");
	private By productNameList = By.xpath("//h2[@class='post-title item_name']");
	private By product1 = By.xpath("//a[text()='Vintage-Style Wallet for Men & Women']");
	private By product2 = By.xpath("//a[text()='Stylish and Trendy Belts for Men']");
	private By product1Image = By.xpath("//*[@id='Blog1']/div[2]/div/div[1]/div/div[1]");
	private By product2Image = By.xpath("//*[@id='Blog1']/div[1]/div[2]/div[12]/div/div[1]");
	private By koraiMateSetProduct = By.xpath("//a[text()='Elegant Korai Floor Mats Set']");
	private By productList = By.xpath("//div[@id='main']");
	private By shoppingBagSymbol = By.xpath("(//a[@class='item_add'])[1]");
	private By itemCountText = By.xpath("//span[@class='simpleCart_quantity']");
	private By shoppingBagSymbol1 = By.xpath("//div[@class='sora-cart-details']");
	private By secreatTemptationLink = By
			.xpath("//a[contains(text(),'Secret Temptation Affair Deodorant Combo for Women')]");

	private By hyperLinks = By.tagName("a");

	private By productPageShoppingBagSymbol = By.xpath("(//i[@class='fa fa-shopping-bag'])[1]");
	private By stylishStonyStarkImage = By.xpath("(//div[@class='post-image-wrap item_image'])[1]");
	private By productPageCheckoutBtn = By.xpath("//span[text()='checkout']");
	private By stylishStonyStarkLink = By
			.xpath("//a[contains(text(),'Stylish Tony Stark-Inspired Sunglasses (Men & Wome')]");
	private By beforeProductPrice = By.xpath("(//span[@class='sora_product_price meta-price'])[1]");
	
	private By mensComfortablelink=By.xpath("//a[contains(text(),\"Men's Comfortable\")]");
	
	public ProductDetailsPage clickOnmensComfortablelink() {
		Elements.doClick(driver, mensComfortablelink);
		return new ProductDetailsPage(driver);
	}

	public int getActualProductPrice() {
		return actualProductPrice;
	}

	public int setActualProductPrice(int actualProductPrice) {
		return this.actualProductPrice = actualProductPrice;
	}

	public String actualProductPriceBefore() {
		String actualPrice = Elements.getText(driver, beforeProductPrice);
		// System.out.println(actualPrice);
		return actualPrice;
	}

	public int productPrice() {

		actualPricewithDollar = Elements.getText(driver, beforeProductPrice);
		if (actualPricewithDollar != null && actualPricewithDollar.startsWith("$")) {
			try {
				String actualPrice = actualPricewithDollar.replace("$", "").trim();
				double actualProductPrice = Double.parseDouble(actualPrice); // Parse as double
				int roundedPrice = (int) Math.round(actualProductPrice); // Round and cast to int
				setActualProductPrice(roundedPrice); // Assuming setActualProductPrice accepts int
				return roundedPrice;
			} catch (NumberFormatException e) {
				System.out.println("Error parsing price: " + e.getMessage());
			}
		} else {
			System.out.println("Price format is invalid.");
		}
		return 0; // Default return if there is an error
	}

	public String getProductPageTitle() {
		String actualProductPageTitle = driver.getTitle();
		return actualProductPageTitle;
	}

	public ProductPage clickOnProduct1() {
		Elements.doClick(driver, stylishStonyStarkLink);
		return this;
	}

	public ProductPage clickProduct2() {
		Elements.doClick(driver, product2);
		return this;
	}

	public void clickOnStylishStonyStarkLink() {
		Elements.doClick(driver, stylishStonyStarkLink);
	//	return new ProductDetailsPage(driver);
	}

	public ProductPage clickOnproductPageShoppingBagSymbol() {
		MouseActionsUtil.moveToElement(driver, stylishStonyStarkImage);
		Elements.doClick(driver, productPageShoppingBagSymbol);
		return this;
	}

	public void countOfHyperLinks() {
		List<WebElement> links = driver.findElements(hyperLinks);
		System.out.println("Total number of hyper links " + links.size());

	}

	public ProductPage clickOnshoppingBagSymbol1() {
		MouseActionsUtil.moveToElement(driver, shoppingBagSymbol1);
		Elements.doClick(driver, productPageCheckoutBtn);
		return this;
	}

	public ProductPage moveToMenMenu() {
		MouseActionsUtil.moveToElement(driver, menuItem);
		return this;

	}

	public ProductPage moveToSubMenu() {
		MouseActionsUtil.moveToElement(driver, subMenuItem);
		Elements.doClick(driver, subMenuItem);
		return this;
	}

	public boolean isPageLoaded() {
		return driver.findElements(productList).size() > 0;
	}

	public void clickOnShoppingBagSymbol() {
		MouseActionsUtil.moveToElement(driver, product1Image);
		Elements.doClick(driver, shoppingBagSymbol);

	}

	public List<WebElement> getProductsList() {
		List<WebElement> products = driver.findElements(productList);
		System.out.println(products.size()); // Debugging statement
		return products;
	}

	public int getItemCount() {
		int itemCount = Integer.parseInt(Elements.getText(driver, itemCountText));
		return itemCount;
	}

	public int getProductList() {
		int productListCount = Integer.parseInt(Elements.getText(driver, productList));
		return productListCount;
	}

	public CartPage clickOncoriaMateSetProduct() {
		Elements.doClick(driver, koraiMateSetProduct);
		return new CartPage(driver);
	}

	public String actualProductPageTitle() {
		 if (driver == null) {
		        throw new RuntimeException("WebDriver instance is null in ProductPage.");
		    }
		String productPageTitle = driver.getTitle();
		return productPageTitle;
	}

	public ProductPage clickOnorayaProduct() {
		Elements.doClick(driver, orayaProduct);
		return this;
	}

	public String getaddItemListText() {
		return Elements.getText(driver, addItemList);
	}

	public String getproductNameListText() {
		return Elements.getText(driver, productNameList);
	}

	public void clickOnProductLink(String product) {
		clickOnEstaDentaCleanProductLink();
		clickOnFancyCoolProductLink();
	}

	public ProductDetailsPage clickOnFancyCoolProductLink() {
		Elements.doClick(driver, fancyCoolProduct);
		return new ProductDetailsPage(driver);
	}

	public void clickOnEstaDentaCleanProductLink() {
		Elements.doClick(driver, estanDentaCleanProduct);
	//	return new ProductDetailsPage(driver);
	}

	public String itemLinkText() {
		String itemTextInProductPage = Elements.getText(driver, koraiMateSetProduct);
		System.out.println(itemTextInProductPage);
		return itemTextInProductPage;

	}

	public ProductPage addMultipleProducts() {
		MouseActionsUtil.moveToElement(driver, product1Image);
		Elements.doClick(driver, product1);
		MouseActionsUtil.moveToElement(driver, product2Image);
		Elements.doClick(driver, product2);
		return this;

	}

}