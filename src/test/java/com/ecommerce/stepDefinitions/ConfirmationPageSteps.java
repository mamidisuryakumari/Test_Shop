package com.ecommerce.stepDefinitions;

import org.junit.Assert;

import com.ecommerce.base.BaseTest;
import com.ecommerce.pages.ConfirmationPage;
import com.ecommerce.reports.ReportManager;

import io.cucumber.java.en.Then;

public class ConfirmationPageSteps extends BaseTest {
	@Then("User navigated to order details page")
	public void user_navigated_to_order_details_page() {
		ConfirmationPage confirmationPage = new ConfirmationPage(driver);
		String expMsg="THANK SURYA. WE RECEIVED YOUR ODER.";
		try {
			Assert.assertEquals(confirmationPage.getSucessmsg(),expMsg);
            ReportManager.getTest().pass("Landed on order details page");
		} catch (AssertionError ae) {
			System.out.println(ae.getMessage());
			ReportManager.getTest().fail("An error occured while navigating the oredr details page");
			throw ae;
		} catch (Exception e) {
			System.out.println("An error occured while navigating the oredr details page");
			ReportManager.getTest().fail("An error occured while navigating the oredr details page");
			throw e;
		}
	}

}
