package com.ecommerce.pages;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    
    private By koraiMateSetProduct=By.xpath("//a[text()='Elegant Korai Floor Mats Set']");
    private By productList=By.xpath("//div[@class='grid-posts']");
    private By shoppingBagSymbol=By.xpath("(//a[@class='item_add'])[1]");
    private By itemCountText=By.xpath("//span[@class='simpleCart_quantity']");
    
    private By shoppingBagSymbol1=By.xpath("//div[@class='sora-cart-details']");
    private By secreatTemptationLink=By.xpath("//a[contains(text(),'Secret Temptation Affair Deodorant Combo for Women')]");
   
    
    public ProductPage clickOnshoppingBagSymbol1() {
    	MouseActionsUtil.moveToElement(driver, shoppingBagSymbol1);
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
        System.out.println( products.size()); // Debugging statement
        return products;
    }
    public int getItemCount() {
    int itemCount=Integer.parseInt(Elements.getText(driver, itemCountText));
    return itemCount;
    }
    
    public int getProductList() {
    	int productListCount=Integer.parseInt(Elements.getText(driver, productList)) ;
		return productListCount;
    }
  
    public CartPage clickOncoriaMateSetProduct() {
    	Elements.doClick(driver, koraiMateSetProduct);
    	return new CartPage(driver);
    }
    public String actualProductPageTitle() {
    	String productPageTitle=driver.getTitle();
    	return productPageTitle;
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
		String itemTextInProductPage = Elements.getText(driver, koraiMateSetProduct);
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