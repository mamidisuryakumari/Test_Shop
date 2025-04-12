package com.ecommerce.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.ecommerce.hooks.Hooks;
import com.ecommerce.pages.AdvancedRegistrationFormPage;
import com.ecommerce.utilities.Elements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AdvancedScenarioSteps {
	
	WebDriver driver = Hooks.getDriver();
	
	AdvancedRegistrationFormPage advancedRegistrationFormPage = new AdvancedRegistrationFormPage(driver);
	
	@Given("I am on advanced registration form")
	public void advancedPage() {
		
	}
	
	@When("I enter {string},{string} and {string}")
	
	public void enterDetails(String userName , String password, String email) {
		Elements.doSendKeys(driver, advancedRegistrationFormPage.userNameFld, userName);
		Elements.doSendKeys(driver, advancedRegistrationFormPage.passwordFld, password);
		Elements.doSendKeys(driver, advancedRegistrationFormPage.emailFld, email);
	}

}
