package com.qa.stepDefinations;

import com.qa.pages.NewQuotePage;
import com.qa.pages.LoginPage;

import com.qa.util.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
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
	

	
	@Then("^user exists the browser$")
	public void user_exists_the_browser() throws Throwable {
		
		driver.close();
	}
	
	
	
	
}
