package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ecommerce.utilities.Elements;
import com.ecommerce.utilities.MouseActionsUtil;

public class ProductPage extends BasePage {

	public ProductPage(WebDriver driver) {
		super(driver);
	}

	private By fancyCoolProduct = By.xpath("//a[text()='Fancy Cool Product']");
	private By estanDentaCleanProduct=By.xpath("//a[contains(text(),'ESTAN Denta Clean Herbal Tooth Paste with Mouth Wash')]");
	private By orayaProduct=By.xpath("//a[contains(text(),'ORAYA 100% Natural Activated Charcoal Teeth Whiten')]");
    private By addItemList=By.xpath("//a[@class='item_add']");
    private By productNameList=By.xpath("//h2[@class='post-title item_name']");
    private By product1=By.xpath("//*[@id=\"Blog1\"]/div[1]/div[2]/div[1]/div/div[1]/a[2]");
    private By product2=By.xpath("//*[@id=\"Blog1\"]/div[1]/div[2]/div[2]/div/div[1]/a[2]");
    private By product1Image = By.xpath("//*[@id=\"Blog1\"]/div[1]/div[2]/div[1]/div/div[1]");
    private By product2Image = By.xpath("//*[@id=\"Blog1\"]/div[1]/div[2]/div[12]/div/div[1]");
    
    private By coriaMateSetProduct=By.xpath("//a[text()='Elegant Korai Floor Mats Set']");
    public CartPage clickOncoriaMateSetProduct() {
    	Elements.doClick(driver, coriaMateSetProduct);
    	return new CartPage(driver);
    }
    public ProductPage actualProductPageTitle() {
    	driver.getTitle();
    	return this;
    }
    
    public ProductPage clickOnorayaProduct() {
    	Elements.doClick(driver, orayaProduct);
    	return this;
    }
    
    public String getaddItemListText() {
    	return Elements.getText(driver, addItemList);
    }
    public  String getproductNameListText() {
    	return Elements.getText(driver, productNameList);
    }
    
    public ProductPage clickOnProduct1() {
    	Elements.doClick(driver, fancyCoolProduct);
    	return this;
    }
    
    public ProductPage clickProduct2() {
    	Elements.doClick(driver, estanDentaCleanProduct);
		return this;
    }
	 public void clickOnProductLink(String product) {
	       clickOnEstaDentaCleanProductLink();
	       clickOnFancyCoolProductLink();
	    }
	public ProductDetailsPage clickOnFancyCoolProductLink()
	{
				Elements.doClick(driver, fancyCoolProduct);
		return new ProductDetailsPage(driver);
	}
	
	public ProductDetailsPage clickOnEstaDentaCleanProductLink() {
		Elements.doClick(driver, estanDentaCleanProduct);
		return new ProductDetailsPage(driver);
	}
	
	public String itemLinkText()
	{
		String itemTextInProductPage = Elements.getText(driver, fancyCoolProduct);
		System.out.println(itemTextInProductPage);
		return  itemTextInProductPage;
		
	}
	
	public ProductPage addMultipleProducts()
	{
		MouseActionsUtil.moveToElement(driver, product1Image);
		Elements.doClick(driver, product1);
		MouseActionsUtil.moveToElement(driver, product2Image);
		Elements.doClick(driver, product2);
		return this;
		
		
		
	}
}