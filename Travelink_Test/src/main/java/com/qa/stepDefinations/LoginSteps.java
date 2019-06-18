package com.qa.stepDefinations;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import com.qa.util.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;

public class LoginSteps extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	@Before
	public void setUp() throws Throwable {
	  TestBase.initialization();
	}

	
	@When("^user enters the homePage$")
	public void user_enters_the_homePage() throws Throwable {
		loginPage  = new LoginPage();
	    
		   homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("database"));
	}
	
/*	
	@After
	public void tearDown()
	{
		driver.close();
	}*/
	
}
