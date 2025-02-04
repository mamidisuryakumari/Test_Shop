package com.ecommerce.hooks;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.ecommerce.driverManager.DriverManager111;
import com.ecommerce.reports.ReportManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HOOKS111 {
	private static WebDriver driver;
	private Scenario scenario;

	@Before
	public void setup(Scenario scenario) throws IOException {
		this.scenario = scenario;
		driver = DriverManager111.initDriver();
	//	ReportManager.createTest(scenario.getName());
		// Retrieve tags from the scenario and pass to createTest
	    String[] tags = scenario.getSourceTagNames().toArray(new String[0]);
	    ReportManager.createTest(scenario.getName(), tags);
		
	}

	@After
	public void tearDown() {
//		DriverManager111.quitDriver();
//		ReportManager.flush();
	}

	public static WebDriver getDriver()
	{
		return driver;
	}

	
//	@AfterStep
	public void takeScreenshot(Scenario scenario) {
	    if (scenario.isFailed()) {
	        TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
	        byte[] screenShot = takeScreenshot.getScreenshotAs(OutputType.BYTES);
	        
	        if (screenShot != null) {
	            // Attach the screenshot to the Cucumber report
	            scenario.attach(screenShot, "image/png", scenario.getName());
	            
	            // Log the failure and screenshot in ExtentReports
	            String base64Screenshot = java.util.Base64.getEncoder().encodeToString(screenShot);
	            ReportManager.getTest().log(Status.FAIL, "Step failed",
	                MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
	        }
	    }
	}


}
