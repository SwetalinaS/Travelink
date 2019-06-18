package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/java/com/qa/features"
,glue= {"com/qa/stepDefinations"}
,plugin = {"pretty", "json:./target/cucumber-reports/Cucumber.json","junit:./target/cucumber-reports/Cucumber.xml",
		 "html:./target/cucumber-reports"}
,dryRun = false,
monochrome = true
)
public class TestRunner {

}
