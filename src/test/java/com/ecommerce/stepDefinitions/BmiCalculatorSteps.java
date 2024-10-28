package com.ecommerce.stepDefinitions;

import org.junit.Assert;

import com.ecommerce.base.BaseTest;
import com.ecommerce.pages.BmiCalculatorPage;
import com.ecommerce.reports.ReportManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BmiCalculatorSteps extends BaseTest{

	BmiCalculatorPage bmiCalculatorPage= new BmiCalculatorPage(driver);


	

	@Then("User should be navigated to BMI calculator page")
	public void user_should_be_navigated_to_bmi_calculator_page() throws InterruptedException {
		Thread.sleep(3000);
	    String exceptedBmiPageTitle="Software Testing Online";
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
	public void the_user_enter_details(String feet, String inches, String weight, String age) throws InterruptedException {
//		Thread.sleep(3000);
	   bmiCalculatorPage.enterFeet(feet);
	   bmiCalculatorPage.enterInches(inches);
	   bmiCalculatorPage.enterWeight(weight);
	   bmiCalculatorPage.enterAge(age);
	}

	@When("The user click on male button")
	public void the_user_click_on_male_button() {
	   bmiCalculatorPage.clickOnFemaleBtn();
	}

	@When("The user clicks on the Calculate BMI button")
	public void the_user_clicks_on_the_calculate_bmi_button() {
	    
	}

	@Then("The system displays the correct BMI value with the category")
	public void the_system_displays_the_correct_bmi_value_with_the_category() {
	   
	}
}
