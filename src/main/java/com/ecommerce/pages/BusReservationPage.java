package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class BusReservationPage extends BasePage{

	public BusReservationPage(WebDriver driver) {
		super(driver);
		
	}

	private By fromCityFld=By.xpath("//select[@id='from']");
	private By tiCityFld=By.xpath("//select[@id='to']");
	private By dateOfJourneyFld=By.xpath("//input[@id='journey-date']");
	private By adultsField=By.xpath("//select[@id='adults']");
	private By childrenFld=By.xpath("//select[@id='children']");
	private By buttonFld=By.xpath("//button[text()='Search']");
}
