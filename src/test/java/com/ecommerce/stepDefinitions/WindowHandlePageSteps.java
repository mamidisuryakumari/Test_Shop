package com.ecommerce.stepDefinitions;

import com.ecommerce.base.BaseTest;
import com.ecommerce.pages.WindowHandlePage;
import com.ecommerce.utilities.Window;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WindowHandlePageSteps extends BaseTest {

	WindowHandlePage windowHandlePage = new WindowHandlePage(driver);

	@Then("The user should be navigated to window handle page")
	public void the_user_should_be_navigated_to_window_handle_page() {
		//String exceptedWindowPageTitle = "Selenium Automation: Handle multiple windows|Software Testing Online";
		System.out.println("I am on window handle page");
	}

	@When("The user click on open single window button")
	public void the_user_click_on_open_single_window_button() {
		
		windowHandlePage.switchToChildWindow();
		

	}

	@Then("The user should be see testshop window is opened")
	public void the_user_should_be_see_testshop_window_is_opened() {
		
		
		System.out.println(driver.getTitle());
	}
	@When("The user click on open two windows button")
	public void the_user_click_on_open_two_windows_button() {
	   windowHandlePage.switchToGoogleWindow();
	}

	@Then("the user should see google window is opened")
	public void the_user_should_see_google_window_is_opened() {
		System.out.println(driver.getTitle());
	}

	
}
