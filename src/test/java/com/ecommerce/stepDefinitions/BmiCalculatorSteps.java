package com.ecommerce.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.ecommerce.base.BaseTest;
import com.ecommerce.hooks.Hooks;
import com.ecommerce.pages.BmiCalculatorPage;
import com.ecommerce.reports.ReportManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BmiCalculatorSteps extends BaseTest {

	WebDriver driver = Hooks.getDriver();
	BmiCalculatorPage bmiCalculatorPage = new BmiCalculatorPage(driver);

	@Then("User should be navigated to BMI calculator page")
	public void user_should_be_navigated_to_bmi_calculator_page() throws InterruptedException {
		Thread.sleep(3000);
		String exceptedBmiPageTitle = "BMI Calculator|Software Testing Online";
		try {
			Assert.assertEquals(bmiCalculatorPage.getBmiPageTitle(), exceptedBmiPageTitle);
			System.out.println("Landed on the BMI claculatorpage");
			ReportManager.getTest().pass("Successfully navigated to the BMI calculatorpage");
		} catch (AssertionError ae) {
			System.out.println("Assertion Failed: " + ae.getMessage());
			ReportManager.getTest().fail("An error occurred while navigating to the BMI calculatorpage");
			throw ae;
		} catch (Exception e) {
			System.out.println("An unexpected error occurred: " + e.getMessage());
			ReportManager.getTest().fail("An unexpected error occurred while navigating to the BMI calculatorpage");
			throw e;
		}
	}

	@When("The user enter details {string},{string},{string},{string}")
	public void the_user_enter_details(String feet, String inches, String weight, String age)
			throws InterruptedException {
		Thread.sleep(3000);
		bmiCalculatorPage.enterFeet(feet);
		bmiCalculatorPage.enterInches(inches);
		bmiCalculatorPage.enterWeight(weight);
		bmiCalculatorPage.enterAge(age);
		ReportManager.getTest().info("Entered weight details successfully");
	}

	@When("The user click on female button")
	public void the_user_click_on_female_button() {
		bmiCalculatorPage.clickOnFemaleBtn();
		ReportManager.getTest().info("User clicked on female button");
	}

	@When("The user clicks on the Calculate BMI button")
	public void the_user_clicks_on_the_calculate_bmi_button() throws InterruptedException {
		Thread.sleep(3000);
		bmiCalculatorPage.clickOnCalculateBmiBtn();
	//	bmiCalculatorPage.clickOnCalculateBMIBtn1();
		ReportManager.getTest().info("User clicked on calculate bmi button");
	}

	@Then("The system displays the correct BMI value with the category")
	public void the_system_displays_the_correct_bmi_value_with_the_category() throws InterruptedException {
		String expectedOverWeightTextMsg = "Your BMI is 27.34 (Overweight)";
		try {
			Assert.assertEquals(bmiCalculatorPage.getOverWeightTextMsg(), expectedOverWeightTextMsg);
			System.out.println("The correct BMI value is displayed");
			ReportManager.getTest().pass("The correct BMI value is displayed");
		} catch (AssertionError ae) {
			System.out.println("Assertion Failed:Expected BMI text does not match actual BMI text" + ae.getMessage());
			ReportManager.getTest().fail("Assertion failed while verifying the BMI value");
			throw ae;
		} catch (Exception e) {
			System.out.println("An unexpected error occurred: " + e.getMessage());
			ReportManager.getTest().fail("An unexpected error occurred while verifying the BMI value");
			throw e;
		}
	}

	@When("The user leaves the height fields empty")
	public void the_user_leaves_the_height_fields_empty() {
		ReportManager.getTest().info("The user leaves the height filelds empty");
	}

	@When("The user enter input valid details {string},{string}")
	public void the_user_enter_input_valid_details(String weight, String age) {
		bmiCalculatorPage.enterWeight(weight);
		bmiCalculatorPage.enterAge(age);
		ReportManager.getTest().info("The user enter input valid details are weight and age");
	}

	@Then("The system displays an error message, {string}")
	public void the_system_displays_an_error_message(String string) {
		String exceptedHeightErrorMsg = "Please enter a valid height.";
		try {
			Assert.assertEquals(bmiCalculatorPage.getHeightErrorMsg(), exceptedHeightErrorMsg);
			System.out.println("The error message is correctly displayed");
			ReportManager.getTest().pass("The error message is correctly displayed as expected");
		} catch (AssertionError ae) {
			System.out.println("Assertion Failed: Expected error message does not match the actual error message "
					+ ae.getMessage());
			ReportManager.getTest().fail("Assertion failed while verifying the error message for height input");
			throw ae;
		} catch (Exception e) {
			System.out.println("An unexpected error occurred: " + e.getMessage());
			ReportManager.getTest()
					.fail("An unexpected error occurred while verifying the error message for height input");
			throw e;
		}
		
	}
	@When("The user leaves the weight field empty")
	public void the_user_leaves_the_weight_field_empty() {
		ReportManager.getTest().info("The user leaves the weight fileld empty");
	}

	@When("The user enter input valid details {string},{string},{string}")
	public void the_user_enter_input_valid_details(String feet, String inches, String age) {
		bmiCalculatorPage.enterFeet(feet);
		bmiCalculatorPage.enterInches(inches);
		bmiCalculatorPage.enterAge(age);
		ReportManager.getTest().info("The user enter input valid details are feet,inches and age");
	}
	
	@Then("The system displays an error message is Please enter a valid weight between 20 kg and 300 kg")
	public void the_system_displays_an_error_message_is_Please_enter_a_valid_weight_between_20_kg_and_300_kg() {
		String exceptedWeightErrorMessage="Please enter a valid weight between 20 kg and 300 kg";
		try {
			Assert.assertEquals(bmiCalculatorPage.getOverWeightTextMsg(), exceptedWeightErrorMessage);
			System.out.println("The error message is correctly displayed");
			ReportManager.getTest().pass("The error message is correctly displayed as expected");
		} catch (AssertionError ae) {
			System.out.println("Assertion Failed: Expected error message does not match the actual error message "
					+ ae.getMessage());
			ReportManager.getTest().fail("Assertion failed while verifying the error message for weight input");
			throw ae;
		} catch (Exception e) {
			System.out.println("An unexpected error occurred: " + e.getMessage());
			ReportManager.getTest()
					.fail("An unexpected error occurred while verifying the error message for weight input");
			throw e;
		}
	}
	

}
