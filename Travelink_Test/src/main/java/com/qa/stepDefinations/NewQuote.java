package com.qa.stepDefinations;

import com.qa.pages.NewQuotePage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;

public class NewQuote extends TestBase{
	
	NewQuotePage homePage;
	NewQuote quotePage;
	
	
	
	@Then("^user Clicks on Create new$")
	public void user_Clicks_on_Create_new() throws Throwable {
		homePage = new NewQuotePage();
		quotePage= homePage.newQuote();
	}

		
}
