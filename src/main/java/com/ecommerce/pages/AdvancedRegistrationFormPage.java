package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ecommerce.utilities.Elements;

import io.cucumber.datatable.DataTable;

public class AdvancedRegistrationFormPage extends BasePage {

	public AdvancedRegistrationFormPage(WebDriver driver) {
		super(driver);
		
	}

	public static By userNameFld = By.id("username");
	public static By passwordFld = By.id("password");
	public static By emailFld = By.id("email");
	public static By femaleRadioBtn = By.xpath("//input[@id='female']");
	public static By moviesCheckBox = By.id("movies");
	public static By countryDropdown = By.id("country");
	public static By dateFld = By.id("dob");
	public static By registerBtn = By.xpath("//button[text()='Register']");
	public static By registrationSuccessfullMsg = By.xpath("//p[text()='Registration Successful!']");
	public static By closeBtn = By.xpath("//button[text()='Close']");
	public static By  clodeSymbol =By.xpath("//span[text()='×']");

	

	
	
	

}
