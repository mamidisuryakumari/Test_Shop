package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ecommerce.utilities.Elements;

public class ConfirmationPage extends BasePage{

	public ConfirmationPage(WebDriver driver) {
		super(driver);
		
	}
	
	private By total=By.xpath("//td[@class='soratotalsuccess']");
	private By sucessmsg=By.xpath("//p[@class='sorathanks']");
	//private By orderDetails=By.xpath("(//td[@class='soraorderidsuccess'])[1]");
	
	
	
	public String getSucessmsg() {
	String sucessMsg=Elements.getText(driver, sucessmsg);
		System.out.println(Elements.getText(driver, sucessmsg));
		return sucessMsg;
	}
	
	public float  getConfirmationTotalCost() {
	    String totalCostString = Elements.getText(driver, total);
	    totalCostString = totalCostString.replace("$", ""); // Remove the dollar sign
	    float totalCost = Float.parseFloat(totalCostString); // Parse the remaining value as a float
	    return totalCost;
	}

	public String contains(String string) {
	 	String expSucessMsg="We received your oder.";
	 	return expSucessMsg;
	}
	
}
