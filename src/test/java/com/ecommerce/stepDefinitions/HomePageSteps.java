package com.ecommerce.stepDefinitions;

import org.junit.Assert;
import org.testng.asserts.Assertion;

import com.ecommerce.base.BaseTest;
import com.ecommerce.pages.HomePage;
import com.ecommerce.reports.ReportManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.AssertionFailedError;

public class HomePageSteps extends BaseTest{
	
	HomePage homePage = new HomePage(driver);

	@Given("The user on the homepge")
	public void the_user_on_the_homepge() {
	    homePage.clickOnPractiseSeleniumMenu();
	    String expectedHomePageTitle = "Software Testing Online";
	    
	    try {
	        Assert.assertEquals(homePage.getHomePageTitle(), expectedHomePageTitle);
	        System.out.println("Landed on the homepage");
	        ReportManager.getTest().pass("Successfully landed on the homepage");
	    } catch (AssertionError ae) {
	        System.out.println("Assertion Failed: " + ae.getMessage());
	        ReportManager.getTest().fail("An error occurred while landing on the homepage");
	        throw ae;
	    } catch (Exception e) {
	        System.out.println("An unexpected error occurred: " + e.getMessage());
	        ReportManager.getTest().fail("An unexpected error occurred on the homepage");
	        throw e;
	    }
	}

	

	@When("The user click on Practise selenium menu")
	public void the_user_click_on_practise_selenium_menu() throws InterruptedException {
		 Thread.sleep(3000);
	   homePage.clickOnPractiseSeleniumMenu();
	   ReportManager.getTest().info("User clicked on the practise selenimu menu");
	  
	}
	
	@Then("The user scrolls down to page")
	public void the_user_scrolls_down_to_page(){
		ReportManager.getTest().info("User scrolled down to the bottom of the page");
	}

	@When("The user click on BMI calculator link")
	public void the_user_click_on_bmi_calculator_link() {
	  //  homePage.clickOnBmiCalculatorLink();
	   
	}
	@When("The user click on handle multiple windows link")
	public void the_user_click_on_handle_multiple_windows() {
	   homePage.clickOnWindowHandleLink();
	}
	
}
