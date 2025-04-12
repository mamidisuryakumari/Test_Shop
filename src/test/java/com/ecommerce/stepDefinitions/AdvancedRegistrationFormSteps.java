package com.ecommerce.stepDefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.ecommerce.hooks.Hooks;
import com.ecommerce.pages.AdvancedRegistrationFormPage;
import com.ecommerce.utilities.Elements;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdvancedRegistrationFormSteps {

	WebDriver driver = Hooks.getDriver();
	AdvancedRegistrationFormPage advancedRegistrationFormPage = new AdvancedRegistrationFormPage(driver);
	
	@Given("I am on advanced registration form page")
		public void iAmOnAdvancedRegistrationForm() {
			
			System.out.println(driver.getTitle());
		}
	
	@When("I add below values in advanced registration form")
	public void enterValues(DataTable dataTable) {
		Map<String, String> registrationTable = dataTable.asMap();
		Elements.doSendKeys(driver, AdvancedRegistrationFormPage.userNameFld, registrationTable.get("UserName"));
		Elements.doSendKeys(driver, AdvancedRegistrationFormPage.passwordFld, registrationTable.get("Password"));
		Elements.doSendKeys(driver, AdvancedRegistrationFormPage.emailFld, registrationTable.get("Email"));
		
	}
	
	@When("I click on register button")
	public void i_click_on_register_button() {
	   
	}

	@Then("I should see registration successfull pop up message")
	public void i_should_see_registration_successfull_pop_up_message() {
	   
	}
}