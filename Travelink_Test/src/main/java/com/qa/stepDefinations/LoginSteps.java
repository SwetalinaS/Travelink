package com.qa.stepDefinations;

import com.qa.pages.NewQuotePage;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.pages.LoginPage;

import com.qa.util.TestBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;

public class LoginSteps extends TestBase {

	LoginPage loginPage;
	NewQuotePage homePage;
	@Before
	public void setUp() throws Throwable {
	  TestBase.initialization();
	}

	
	@When("^user enters the homePage$")
	public void user_enters_the_homePage() throws Throwable {
		loginPage  = new LoginPage();
	    
		   homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("database"));
	}
	


	@After
	public void tearDown(Scenario scenario) throws Throwable {
		Thread.sleep(2000);
		if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png"); //stick it in the report
    }
		loginPage  = new LoginPage();
		loginPage.logout();
		Thread.sleep(1000);
		driver.close();
	}

	
	/*@Then("^user exists the browser$")
	public void user_exists_the_browser() throws Throwable {
		
		driver.close();
	}*/
	
	
	
	
}
