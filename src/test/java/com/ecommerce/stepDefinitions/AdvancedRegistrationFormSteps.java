package com.ecommerce.stepDefinitions;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.ecommerce.hooks.Hooks;
import com.ecommerce.pages.AdvancedRegistrationFormPage;
import com.ecommerce.utilities.CommonUtils;
import com.ecommerce.utilities.DropdownUtil;
import com.ecommerce.utilities.Elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class AdvancedRegistrationFormSteps {

	WebDriver driver = Hooks.getDriver();

	AdvancedRegistrationFormPage advancedRegistrationFormPage = new AdvancedRegistrationFormPage(driver);
	private static Logger logger = LoggerFactory.getLogger(AdvancedRegistrationFormSteps.class);

	@Given("I am on advanced registration form page")
	public void i_am_on_advanced_registration_form_page() throws IOException {
		CommonUtils.getProperties().getProperty("url");
		String expectedAdvancedRegistrationPageTitle = "Advanced Registration Form|Software Testing Online";
		Assert.assertEquals(expectedAdvancedRegistrationPageTitle, expectedAdvancedRegistrationPageTitle);
	}

	@When("I add below values in advanced registration form")
	public void i_add_below_values_in_advanced_registration_form(DataTable dataTable) {

		Map<String, String> registrationFrom = dataTable.asMap();

		Elements.doSendKeys(driver, AdvancedRegistrationFormPage.userNameFld, registrationFrom.get("UserName"));
		Elements.doSendKeys(driver, AdvancedRegistrationFormPage.passwordFld, registrationFrom.get("Password"));
		Elements.doSendKeys(driver, AdvancedRegistrationFormPage.emailFld, registrationFrom.get("Email"));
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB).perform();
		// actions.sendKeys(" ").perform();
		Elements.doClick(driver, AdvancedRegistrationFormPage.femaleRadioBtn);
		Elements.selectCheckbox(driver, AdvancedRegistrationFormPage.moviesCheckBox);
		DropdownUtil.selectByVisibleText(driver, AdvancedRegistrationFormPage.countryDropdown, "India");
		Elements.doSendKeys(driver, AdvancedRegistrationFormPage.dateFld, "21-06-1990");

	}

	@When("I click on register button")
	public void i_click_on_register_button() throws InterruptedException {

		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);

		Elements.doClick(driver, AdvancedRegistrationFormPage.registerBtn);

		Set<String> windows1 = driver.getWindowHandles();
		System.out.println(windows1);

	}

	@Then("I should see registration successfull pop up message")
	public void i_should_see_registration_successfull_pop_up_message() {
		// AlertUtil.isAlertPresent(driver);

		// AlertUtil.acceptAlert(driver, AdvancedRegistrationFormPage.closeBtn);
		Elements.doClick(driver, AdvancedRegistrationFormPage.closeBtn);

	}
}