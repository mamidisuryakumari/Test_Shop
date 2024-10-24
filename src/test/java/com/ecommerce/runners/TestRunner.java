package com.ecommerce.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/ecommrece/features", 
                 glue = {"com.ecommerce.stepDefinitions", "com.ecommerce.hooks"},
                		 tags = "@Regression",
                 plugin = {"pretty", "html:target/cucumber-reports.html",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 dryRun = false,
                 monochrome = true
)




public class TestRunner {
}
